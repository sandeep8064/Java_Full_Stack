<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Example 1</title>
</head>
<body>
<%java.util.Date date = new java.util.Date(); %>
Current date is <%=date %>
<br>
Enter Your Name
 <form action="/login.do" method="POST">
		Name : <input name="name" type="text" /> <input type="submit" />
	</form>
</body>
</html>