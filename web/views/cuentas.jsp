
<jsp:include page="../components/layout/header.jsp">
    <jsp:param name="pageTitle" value="Cuentas" />
</jsp:include>


<%@ page import="java.util.List" %>
<%@ page import="model.Usuario" %>

<%
  List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
%>

<div class="flex justify-center bg-white p-4">
    <table class="table table-striped table-bordered max-w-[1100px] w-full">
    <thead class="bg-gray-100 text-gray-700">
      <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Rol</th>
        <th>DNI</th>
        <th>Celular</th>
        <th>Horario</th>
      </tr>
    </thead>
    <tbody>
      <% if (usuarios != null) {
           for (Usuario u : usuarios) { %>
        <tr>
          <td><%= u.getIdUsuario() %></td>
          <td><%= u.getNombre() %></td>
          <td><%= u.getIdRol() %></td>
          <td><%= u.getDni() %></td>
          <td><%= u.getCelular() %></td>
          <td><%= u.getIdHorario() %></td>
        </tr>
      <%   }
        } else { %>
        <tr><td colspan="6">No hay usuarios registrados.</td></tr>
      <% } %>
    </tbody>
  </table>
    
</div>


<%@ include file="../components/layout/footer.jsp" %>


