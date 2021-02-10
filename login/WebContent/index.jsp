<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="utf-8"%>
<%@page import="br.com.login.beans.*"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<jsp:include page='/Views/Screen/links_CSS.jsp' />
<% if (session.getAttribute("loginAcesso") != null || session.getAttribute("senha") != null) { %>
<script>location.href = "home.jsp";</script>
<%	} %>
<jsp:include page='/Views/Screen/title.jsp' />
</head>
<body>
	<div id="login-wrapper">
		<div class="box-header login">ACESSO</div>
		<div class="box">
			<form method="post" action="verificaLogin.jsp" class="login">
				<div class="row">
					<label>Login:</label> 
					<input name="loginAcesso" type="text"	id="loginAcesso" size="20" maxlength="25">
				</div>
				<div class="row">
					<label>Senha:</label> 
					<input name="senha" type="password" id="senha" size="20" maxlength="10">
				</div>
				<div align="center">
					<input type="submit" name="acao" value="Entrar" class="button">
				</div>
				<br>
			</form>
		</div>
	</div>
</body>
</html>