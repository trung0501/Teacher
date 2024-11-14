<%-- 
    Document   : displaygiaovien
    Created on : Nov 13, 2024, 8:55:47 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Đăng nhập</h1>
        <form action="LoginServlet_0534" method="post">
            Mã giảng viên : <input type="text" name = "magv" > <br>
            Họ tên: <input type="text" name = "ten" ><br>
            Giới tính: <input type="text" name = "gioitinh" > <br>
            Điểm: <input type="text" name = "diem" > <br>
            Học vị: <input type="text" name = "hocvi" > <br>
            Chuyên nghành: <input type="text" name = "chuyennghanh" > <br>
            <input type="submit" name ="chucnang" value = "Add">
            <input type="submit" name ="chucnang" value = "Delete">
            
            <label>Chọn thuộc tính để sắp xếp:</label>
            <input type="radio" name="sort_attribute" value="ten" id="ten" checked>
            <label for="ten">Tên</label>

            <input type="radio" name="sort_attribute" value="gioitinh" id="gioitinh">
            <label for="gioitinh">Giới tính</label>  
            <input type="submit" name="chucnang" value="Sắp xếp">
        </form>
    </body>
</html>
