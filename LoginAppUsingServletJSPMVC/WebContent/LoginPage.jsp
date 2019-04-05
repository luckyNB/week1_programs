
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet Login Example</title>
</head>
<body bgcolor="aquamarine">

	<h1 style="color: red; text-align: center">Login Page</h1>
<center>
	<form action="log" method="post">

		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username"></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>

			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><a href="Register.jsp">Register</a>&nbsp;<a
					href="ForgotPassword.jsp">Forgot Password</a></td>

			</tr>
		</table>

	</form>

</center>

</body>
</html>