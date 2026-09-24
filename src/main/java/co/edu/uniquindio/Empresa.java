package co.edu.uniquindio;

public class Empresa {

    //Atributos
    private String nombreEmpresa;
    private String nitEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String paginaWebEmpresa;

    private Cliente[] listClientes;
    private Proyecto[] listProyectos;
    private Desarrollador[] listDesarrolladores;
    private ServicioAdicional[] listServiciosAdicionales;

    //Constructor
    public Empresa(String nombreEmpresa, ServicioAdicional[] listServiciosAdicionales, Desarrollador[] listDesarrolladores, Proyecto[] listProyectos, String paginaWebEmpresa, Cliente[] listClientes, String telefonoEmpresa, String direccionEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listServiciosAdicionales = listServiciosAdicionales;
        this.listDesarrolladores = listDesarrolladores;
        this.listProyectos = listProyectos;
        this.paginaWebEmpresa = paginaWebEmpresa;
        this.listClientes = listClientes;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    //Getters and setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ServicioAdicional[] getListServiciosAdicionales() {
        return listServiciosAdicionales;
    }

    public void setListServiciosAdicionales(ServicioAdicional[] listServiciosAdicionales) {
        this.listServiciosAdicionales = listServiciosAdicionales;
    }

    public Desarrollador[] getListDesarrolladores() {
        return listDesarrolladores;
    }

    public void setListDesarrolladores(Desarrollador[] listDesarrolladores) {
        this.listDesarrolladores = listDesarrolladores;
    }

    public Proyecto[] getListProyectos() {
        return listProyectos;
    }

    public void setListProyectos(Proyecto[] listProyectos) {
        this.listProyectos = listProyectos;
    }

    public Cliente[] getListClientes() {
        return listClientes;
    }

    public void setListClientes(Cliente[] listClientes) {
        this.listClientes = listClientes;
    }

    public String getPaginaWebEmpresa() {
        return paginaWebEmpresa;
    }

    public void setPaginaWebEmpresa(String paginaWebEmpresa) {
        this.paginaWebEmpresa = paginaWebEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }





}
