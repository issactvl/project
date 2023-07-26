<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>.a{color:violet;font-size:40px;}</style>
</head>
<body>
<div class=a>F L I P K A R T</div>
<form method="post" action="AddProduct" enctype="multipart/form-data">
    <input type="text" name="name" placeholder="Product Name" required><br><br>
    <textarea name="description" placeholder="Product Description" required></textarea><br><br>
    <input type="number" name="price" placeholder="Product Price" min="0" step="1" required><br><br>
    <input type ="number" name="quantity" placeholder="Product Quantity" min="0" step="1" required><br><br>
    <input type="file" name="image" required><br><br>
    <button type="submit">Add Product</button>
</form>
</body>
</html>