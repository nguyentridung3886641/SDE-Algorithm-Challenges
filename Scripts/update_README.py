import re
import os

def process_readme(file_path="README.md"):
    if not os.path.exists(file_path):
        print(f"❌ Không tìm thấy file {file_path}")
        return

    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()

    # 1. ĐẾM TỔNG SỐ BÀI ĐÃ GIẢI
    total_solved = 0
    for line in content.split('\n'):
        # Nếu dòng thuộc bảng và có chứa link (http hoặc href)
        if re.match(r'^\s*\|\s*\d+\s*\|', line) and ('http' in line or 'href' in line):
            total_solved += 1

    # 2. CẬP NHẬT PROGRESS BAR & SỐ LƯỢNG
    percentage = round((total_solved / 400) * 100, 1)
    content = re.sub(r'- \*\*Completed:\*\* \d+/400', f'- **Completed:** {total_solved}/400', content)
    content = re.sub(r'!\[Progress\]\(https://geps\.dev/progress/[\d\.]+\)', f'![Progress](https://geps.dev/progress/{percentage})', content)

    # 3. CHUẨN HÓA TOÁN HỌC (Phiên bản mạnh nhất)
    def format_math(match):
        inner = match.group(1).strip()
        inner = inner.replace('log n', r'\log n')
        inner = inner.replace('log(m+n)', r'\log(m+n)')
        inner = inner.replace(' . ', r' \cdot ')
        return f" $\\mathcal{{O}}({inner})$ "

    # Tìm tất cả chuỗi O(...) nằm giữa 2 dấu | của bảng
    content = re.sub(r'(?<=\|)\s*O\(([^)]+)\)\s*(?=\|)', format_math, content)

    # 4. CHUYỂN LINK SANG MỞ TAB MỚI
    content = re.sub(r'(?<!\!)\[([^\]]+)\]\((http[^)]+)\)', r'<a href="\2" target="_blank">\1</a>', content)

    # LƯU LẠI
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(content)

    print(f"✅ Đã dọn dẹp xong! Tiến độ: {total_solved}/400 bài ({percentage}%)")

if __name__ == "__main__":
    process_readme()