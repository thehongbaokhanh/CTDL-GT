# Ba thuật toán theo đề thi

Main.java gồm mã giả tiếng Việt và cài đặt Java cho:
1. Tìm kiếm tuyến tính.
2. Sắp xếp chèn tăng dần.
3. Tính giai thừa bằng đệ quy.

Đã chạy thử trước khi comment toàn bộ code. Kết quả lưu trong ket-qua.txt.
Đã kiểm tra thêm mảng rỗng, phần tử trùng, giá trị không tồn tại, mảng có số âm, 0! và 20!.
Giai thừa dùng kiểu long nên chỉ nhận n từ 0 đến 20.
Đã bỏ menu, sắp xếp nổi bọt và Fibonacci vì không thuộc ba câu trong ảnh.

## Chạy lại

Bỏ tiền tố `// ` ở đầu mỗi dòng trong Main.java (dòng chỉ có `//` trở thành dòng trống).
Các comment mã giả bên trong vẫn được giữ lại sau bước này.
Sau đó chạy:

```sh
javac -encoding UTF-8 Main.java
java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 Main
```

Trong PowerShell, dùng `java '-Dfile.encoding=UTF-8' '-Dstdout.encoding=UTF-8' Main`.
Console cần hỗ trợ UTF-8 để hiển thị đúng dấu tiếng Việt.
Java in ra console bằng System.out.println, tương ứng với console.log trong JavaScript.

