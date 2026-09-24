package co.edu.uniquindio;

public class Desarrollador {

    //Atributos
    private String idDesarrollador;
    private String equipoTrabajo;
    private String nivelDesarrollador;
    private int cantidadMaxProyectos;
    private double tarifaDesarrollador;
    private String estadoDesarrollador;

    private Proyecto theProyecto;

    //Constructor


    public String getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(String idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(String equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public String getNivelDesarrollador() {
        return nivelDesarrollador;
    }

    public void setNivelDesarrollador(String nivelDesarrollador) {
        this.nivelDesarrollador = nivelDesarrollador;
    }

    public int getCantidadMaxProyectos() {
        return cantidadMaxProyectos;
    }

    public void setCantidadMaxProyectos(int cantidadMaxProyectos) {
        this.cantidadMaxProyectos = cantidadMaxProyectos;
    }

    public double getTarifaDesarrollador() {
        return tarifaDesarrollador;
    }

    public void setTarifaDesarrollador(double tarifaDesarrollador) {
        this.tarifaDesarrollador = tarifaDesarrollador;
    }

    public String getEstadoDesarrollador() {
        return estadoDesarrollador;
    }

    public void setEstadoDesarrollador(String estadoDesarrollador) {
        this.estadoDesarrollador = estadoDesarrollador;
    }

    public Proyecto getTheProyecto() {
        return theProyecto;
    }

    public void setTheProyecto(Proyecto theProyecto) {
        this.theProyecto = theProyecto;
    }
}

}
