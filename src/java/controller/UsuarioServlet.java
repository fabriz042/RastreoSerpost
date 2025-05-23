package controller;

import dao.UsuarioDAO;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/cuentas")
public class UsuarioServlet extends HttpServlet {

    private UsuarioDAO usuarioDAO;

    @Override
    public void init() {
        usuarioDAO = new UsuarioDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "listar";  // Acción por defecto
        }

        switch (action) {
            case "nuevo":
                mostrarFormularioNuevoUsuario(request, response);
                break;
            case "editar":
                mostrarFormularioEditarUsuario(request, response);
                break;
            case "eliminar":
                eliminarUsuario(request, response);
                break;
            case "listar":
            default:
                listarUsuarios(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí manejamos los envíos de formularios: guardar o actualizar
        String idParam = request.getParameter("id_usuario");
        
        if (idParam == null || idParam.isEmpty()) {
            agregarUsuario(request, response);
        } else {
            actualizarUsuario(request, response);
        }
    }

    // Métodos privados para cada acción:

    private void listarUsuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> lista = usuarioDAO.listar();
        System.out.println("Usuarios encontrados: " + (lista != null ? lista.size() : "null"));
        request.setAttribute("usuarios", lista);
        request.getRequestDispatcher("views/cuentas.jsp").forward(request, response);
    }

    private void mostrarFormularioNuevoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/usuario_form.jsp").forward(request, response);
    }

    private void mostrarFormularioEditarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idUsuario = Integer.parseInt(request.getParameter("id_usuario"));
        Usuario usuario = usuarioDAO.obtenerPorId(idUsuario);
        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("views/usuario_form.jsp").forward(request, response);
    }

    private void agregarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Usuario u = new Usuario();
        u.setIdUsuario(Integer.parseInt(request.getParameter("id_usuario")));
        u.setNombre(request.getParameter("nombre"));
        u.setIdRol(Integer.parseInt(request.getParameter("id_rol")));
        u.setDni(Integer.parseInt(request.getParameter("dni")));
        u.setContraseña(request.getParameter("contraseña"));
        u.setCelular(Integer.parseInt(request.getParameter("celular")));
        u.setIdHorario(Integer.parseInt(request.getParameter("id_horario")));

        usuarioDAO.agregar(u);
        response.sendRedirect("usuarios");
    }

    private void actualizarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Usuario u = new Usuario();
        u.setIdUsuario(Integer.parseInt(request.getParameter("id_usuario")));
        u.setNombre(request.getParameter("nombre"));
        u.setIdRol(Integer.parseInt(request.getParameter("id_rol")));
        u.setDni(Integer.parseInt(request.getParameter("dni")));
        u.setContraseña(request.getParameter("contraseña"));
        u.setCelular(Integer.parseInt(request.getParameter("celular")));
        u.setIdHorario(Integer.parseInt(request.getParameter("id_horario")));

        usuarioDAO.actualizar(u);
        response.sendRedirect("usuarios");
    }

    private void eliminarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idUsuario = Integer.parseInt(request.getParameter("id_usuario"));
        usuarioDAO.eliminar(idUsuario);
        response.sendRedirect("usuarios");
    }
}
