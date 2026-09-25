package co.edu.uniquindio;

import java.time.LocalDate;

class Proyecto {
    private String codigoProyecto;
    private LocalDate fechaSolicitud; // Tipo LocalDate
    private LocalDate fechaInicio;    // Tipo LocalDate
    private LocalDate fechaEntrega;   // Tipo LocalDate
    private String estado; // Pendiente, Confirmado, En curso, Finalizado, Cancelado
    private String metodoPago;
    private String docCliente;
    private int diasDesarrollo; // Tipo int

    // Arreglos fijos
    private Desarrollador[] desarrolladores;
    private int cantDesarrolladores;
    private ServicioAdicional[] servicios;
    private int cantServicios;

    public Proyecto(String codigo, LocalDate fechaSolicitud, LocalDate fechaInicio, LocalDate fechaEntrega, String estado, String metodoPago, String docCliente, int diasDesarrollo) {
        this.codigoProyecto = codigo;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.docCliente = docCliente;
        this.diasDesarrollo = diasDesarrollo;
        this.desarrolladores = new Desarrollador[10];
        this.cantDesarrolladores = 0;
        this.servicios = new ServicioAdicional[10];
        this.cantServicios = 0;
    }

    public String getCodigoProyecto() { return codigoProyecto; }
    public void setCodigoProyecto(String codigoProyecto) { this.codigoProyecto = codigoProyecto; }
    public LocalDate getFechaSolicitud() { return fechaSolicitud; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getDocCliente() { return docCliente; }

    public boolean agregarDesarrollador(Desarrollador dev) {
        if (cantDesarrolladores < desarrolladores.length) {
            desarrolladores[cantDesarrolladores] = dev;
            cantDesarrolladores++;
            return true;
        }
        return false;
    }

    public boolean agregarServicio(ServicioAdicional serv) {
        if (cantServicios < servicios.length) {
            servicios[cantServicios] = serv;
            cantServicios++;
            return true;
        }
        return false;
    }

    public Desarrollador[] getDesarrolladores() { return desarrolladores; }
    public int getCantDesarrolladores() { return cantDesarrolladores; }

    public double calcularValorTotal() {
        double costoDevs = 0;
        for (int i = 0; i < cantDesarrolladores; i++) {
            costoDevs += desarrolladores[i].getTarifaDia() * diasDesarrollo;
        }
        double costoServicios = 0;
        for (int i = 0; i < cantServicios; i++) {
            costoServicios += servicios[i].getPrecio();
        }
        return costoDevs + costoServicios;
    }

    public String mostrarInfo() {
        return "Cód: " + codigoProyecto + " | Solicitud: " + fechaSolicitud + " | Estado: " + estado +
                " | Pago: " + metodoPago + " | Cliente: " + docCliente + " | Total: $" + calcularValorTotal();
    }
}