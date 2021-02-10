<%@page import="java.util.*"%>
<%@page import="br.com.login.beans.comum.*"%>
<%@page import="br.com.login.daos.*"%>
<%@page import="br.com.login.tools.*"%>
<%
	Acesso usuario = new Acesso();

	usuario.setLoginAcesso(request.getParameter("loginAcesso"));
	usuario.setSenha(Criptografia.criptografar(request.getParameter("senha")));
	
	ADao dao = new ADao();
	usuario =  dao.buscarLogin(usuario);
	
	if( usuario != null){
		usuario.setLogado(true);
		session.setAttribute("user",usuario);
		session.setAttribute("login", usuario.getLoginAcesso());
 %>
<script>location.href = "<%=request.getContextPath()%>/Views/home.jsp";</script>
<% } else { %>
<script>alert("Login de acesso/Senha inválidos");</script>
<script>location.href = "index.jsp";</script>
<% } %>