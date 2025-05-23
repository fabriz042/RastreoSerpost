package model;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private int idRol;
    private int dni;
    private String contraseña;
    private int celular;
    private int idHorario;

    public Usuario() {}

    public Usuario(int idUsuario, String nombre, int idRol, int dni, String contraseña, int celular, int idHorario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.idRol = idRol;
        this.dni = dni;
        this.contraseña = contraseña;
        this.celular = celular;
        this.idHorario = idHorario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
}
