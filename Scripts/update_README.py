import re
import os

def format_math(text):
    text = text.strip()
    if not text or text == "-":
        return text
    
    if "$\\mathcal{O}" in text:
        return text

    match = re.match(r'^O\((.*)\)$', text)
    if match:
        inner = match.group(1)
        inner = inner.replace('log n', r'\log n')
        inner = inner.replace('log(m+n)', r'\log(m+n)')
        inner = inner.replace(' . ', r' \cdot ')
        return "$\\mathcal{O}(" + inner + ")$"
    
    return text

def process_readme(file_path="README.md"):
    if not os.path.exists(file_path):
        print(f"❌ Không tìm thấy file {file_path} tại thư mục hiện tại.")
        return

    with open(file_path, "r", encoding="utf-8") as f:
        lines = f.readlines()

    total_solved = 0
    new_lines = []
    
    is_table_row = re.compile(r'^\|\s*\d+\s*\|')

    for line in lines:
        if is_table_row.match(line):
            parts = line.split('|')
            
            if len(parts) >= 8:
                problem_col = parts[3].strip()
                if problem_col != "[]()" and ("http" in problem_col or "href=" in problem_col):
                    total_solved += 1

                original_complexity = parts[6]
                parts[6] = f" {format_math(original_complexity)} "
            
            line = "|".join(parts)
            
            line = re.sub(r'(?<!\!)\[([^\]]+)\]\(([^)]+)\)', r'<a href="\2" target="_blank">\1</a>', line)

        new_lines.append(line)

    content = "".join(new_lines)
    
    percentage = round((total_solved / 400) * 100, 1)

    content = re.sub(r'- \*\*Completed:\*\* \d+/400', f'- **Completed:** {total_solved}/400', content)
    
    content = re.sub(r'!\[Progress\]\(https://geps\.dev/progress/[\d\.]+\)', f'![Progress](https://geps.dev/progress/{percentage})', content)

    with open(file_path, "w", encoding="utf-8") as f:
        f.write(content)

    print("✅ Đã cập nhật file README.md thành công!")
    print(f"📊 Tiến độ hiện tại: {total_solved}/400 bài ({percentage}%)")

if __name__ == "__main__":
    process_readme()