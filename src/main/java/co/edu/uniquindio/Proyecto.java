package co.edu.uniquindio;


import java.time.LocalDate;

public class Proyecto {
    //Atributos
    private String idProyecto;
    private LocalDate fechaSolicitud;
    private LocalDate fechaInicio;
    private LocalDate fechaEntrega;
    private String estadoProyecto;
    private String metodoPago;

    private Cliente theCliente;
    private Desarrollador [] listDesarrolladores;
    private ServiciosAdicionales [] listServiciosAdicionales;

    //Constructor
    public Proyecto (String idProyecto, LocalDate fechaSolicitud, LocalDate fechaInicio, LocalDate fechaEntrega, String estadoProyecto, String estadoProyecto, String metodoPago) {

        this.idProyecto = idProyecto;
        this.fechaSolicitud= fechaSolicitud;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estadoProyecto = estadoProyecto;
        this.metodoPago = metodoPago;
        theCliente = null;
        listDesarrolladores = new Desarrollador[10];
        listServiciosAdicionales = new ServiciosAdicionales[4];
    }

    //Metodos getter y setter


    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(String estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }

    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

    public Desarrollador[] getListDesarrolladores() {
        return listDesarrolladores;
    }

    public void setListDesarrolladores(Desarrollador[] listDesarrolladores) {
        this.listDesarrolladores = listDesarrolladores;
    }

    public ServiciosAdicionales[] getListServiciosAdicionales() {
        return listServiciosAdicionales;
    }

    public void setListServiciosAdicionales(ServiciosAdicionales[] listServiciosAdicionales) {
        this.listServiciosAdicionales = listServiciosAdicionales;
    }
}
}
