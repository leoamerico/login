<div class="header-top tr">
<%@page import="br.com.login.beans.comum.*"%>
<%@page import="br.com.login.tools.*"%>
<%@page import="java.util.*"%>
<%Acesso usuario = (Acesso) session.getAttribute("user");%>
	<p>  
	<div class="header-top tr">
		<form action="<%=request.getContextPath()%>/Views/logout.jsp">
			Bem-vindo &nbsp; <%=usuario.getUsuario().getNome() %> &nbsp;|&nbsp; 
			<button class="small">Sair</button>	
		</form>	
    </div>
</div>