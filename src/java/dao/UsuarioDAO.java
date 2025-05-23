package dao;

import model.Usuario;
import util.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // Listar todos los usuarios
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setIdRol(rs.getInt("id_rol"));
                u.setDni(rs.getInt("DNI"));
                u.setContraseña(rs.getString("contraseña"));
                u.setCelular(rs.getInt("celular"));
                u.setIdHorario(rs.getInt("id_horario"));

                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Agregar un nuevo usuario
    public boolean agregar(Usuario u) {
        String sql = "INSERT INTO Usuario (id_usuario, nombre, id_rol, DNI, contraseña, celular, id_horario) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, u.getIdUsuario());
            ps.setString(2, u.getNombre());
            ps.setInt(3, u.getIdRol());
            ps.setInt(4, u.getDni());
            ps.setString(5, u.getContraseña());
            ps.setInt(6, u.getCelular());
            ps.setInt(7, u.getIdHorario());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Obtener un usuario por ID
    public Usuario obtenerPorId(int idUsuario) {
        Usuario u = null;
        String sql = "SELECT * FROM Usuario WHERE id_usuario = ?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    u = new Usuario();
                    u.setIdUsuario(rs.getInt("id_usuario"));
                    u.setNombre(rs.getString("nombre"));
                    u.setIdRol(rs.getInt("id_rol"));
                    u.setDni(rs.getInt("DNI"));
                    u.setContraseña(rs.getString("contraseña"));
                    u.setCelular(rs.getInt("celular"));
                    u.setIdHorario(rs.getInt("id_horario"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return u;
    }

    // Actualizar usuario
    public boolean actualizar(Usuario u) {
        String sql = "UPDATE Usuario SET nombre=?, id_rol=?, DNI=?, contraseña=?, celular=?, id_horario=? WHERE id_usuario=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setInt(2, u.getIdRol());
            ps.setInt(3, u.getDni());
            ps.setString(4, u.getContraseña());
            ps.setInt(5, u.getCelular());
            ps.setInt(6, u.getIdHorario());
            ps.setInt(7, u.getIdUsuario());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar usuario por ID
    public boolean eliminar(int idUsuario) {
        String sql = "DELETE FROM Usuario WHERE id_usuario=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
