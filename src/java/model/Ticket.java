package model;

import java.sql.Date;

public class Ticket {
    private int idTicket;
    private int idPaquete;
    private Date fechaTurno;
    private String estadoTurno;

    public Ticket() {}

    public Ticket(int idTicket, int idPaquete, Date fechaTurno, String estadoTurno) {
        this.idTicket = idTicket;
        this.idPaquete = idPaquete;
        this.fechaTurno = fechaTurno;
        this.estadoTurno = estadoTurno;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(String estadoTurno) {
        this.estadoTurno = estadoTurno;
    }
}
