<jsp:include page='/Views/Screen/links_CSS.jsp' />
<jsp:include page='/Views/Screen/links_Js.jsp' />
<%@page import="br.com.login.beans.comum.*"%>
<%@page import="java.util.*"%>
<div id="header">
	<jsp:include page='/Views/Screen/topo.jsp' />
	<% Acesso usuario = (Acesso) session.getAttribute("user"); 
		if (usuario == null) { 
	%>
	<script>top.location = "../Views/logout.jsp";</script>
	<% }else{ %>
	<div class="header-middle">
		<jsp:include page='/Views/Screen/logo.jsp'/>
		<br class="cl">
	</div>
	<div class="header-bottom">
		<% } %>
	</div>
</div>