import re
import os

# Tự động xác định đường dẫn file README.md dựa trên vị trí của file script
script_dir = os.path.dirname(os.path.abspath(__file__))
# Nhảy ra ngoài 1 cấp từ folder Scripts để tìm README.md
default_path = os.path.join(script_dir, "..", "README.md")

def process_readme(file_path=default_path):
    if not os.path.exists(file_path):
        print(f"❌ Không tìm thấy file {file_path}. Kiểm tra lại vị trí Terminal!")
        return

    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()

    # 1. ĐẾM TỔNG SỐ BÀI ĐÃ GIẢI (Dựa trên dòng có link bài tập)
    total_solved = 0
    lines = content.split('\n')
    for line in lines:
        if re.match(r'^\s*\|\s*\d+\s*\|', line) and ('http' in line or 'href' in line):
            total_solved += 1

    # 2. CẬP NHẬT PROGRESS BAR & SỐ LƯỢNG
    percentage = round((total_solved / 400) * 100, 1)
    content = re.sub(r'- \*\*Completed:\*\* \d+/400', f'- **Completed:** {total_solved}/400', content)
    content = re.sub(r'!\[Progress\]\(https://geps\.dev/progress/[\d\.]+\)', f'![Progress](https://geps.dev/progress/{percentage})', content)

    # 3. CHUẨN HÓA TOÁN HỌC (Render LaTeX cho chuyên nghiệp)
    def format_math(match):
        inner = match.group(1).strip()
        inner = inner.replace('log n', r'\log n')
        inner = inner.replace('log(m+n)', r'\log(m+n)')
        inner = inner.replace(' . ', r' \cdot ')
        # Nếu có dấu mũ như n^2, n^3... tự động bọc trong {} nếu cần (tùy chọn)
        return f" $\\mathcal{{O}}({inner})$ "

    # Tìm cấu trúc O(...) nằm trong các cột của bảng
    content = re.sub(r'(?<=\|)\s*O\(([^)]+)\)\s*(?=\|)', format_math, content)

    # GHI LẠI VÀO FILE
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(content)

    print(f"✅ Đã cập nhật xong! Tiến độ: {total_solved}/400 bài ({percentage}%)")

if __name__ == "__main__":
    process_readme()