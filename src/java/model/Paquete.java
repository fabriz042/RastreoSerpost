package model;

import java.sql.Timestamp;

public class Paquete {
    private int idPaquete;
    private String tracking;
    private int idDireccion;
    private Timestamp fechaRegistro;
    private String modoEntrega;
    private int idUsuario;
    private int idAgenciaDest;
    private String origen;

    public Paquete() {}

    public Paquete(int idPaquete, String tracking, int idDireccion, Timestamp fechaRegistro, String modoEntrega, int idUsuario, int idAgenciaDest, String origen) {
        this.idPaquete = idPaquete;
        this.tracking = tracking;
        this.idDireccion = idDireccion;
        this.fechaRegistro = fechaRegistro;
        this.modoEntrega = modoEntrega;
        this.idUsuario = idUsuario;
        this.idAgenciaDest = idAgenciaDest;
        this.origen = origen;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getModoEntrega() {
        return modoEntrega;
    }

    public void setModoEntrega(String modoEntrega) {
        this.modoEntrega = modoEntrega;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdAgenciaDest() {
        return idAgenciaDest;
    }

    public void setIdAgenciaDest(int idAgenciaDest) {
        this.idAgenciaDest = idAgenciaDest;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
