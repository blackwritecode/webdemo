<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	<h2>Hello World!</h2>
	<form action="login?query=123" method="post">
		<table>
			<thead>
				<tr>
					<th>登录</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>用户名：</td>
					<td><input type="text" id="username" name="username"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
