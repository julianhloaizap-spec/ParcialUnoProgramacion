package co.edu.uniquindio;

public class ServicioAdicional {
    // Atributos
    private String idServicios;
    private String nombreServicio;
    private String descripcionServicio;
    private double precioServicio;
    private String disponibilidadServicio;

    private Proyecto theProyecto;

    //Constructor
    public ServicioAdicional (String idServicios, String nombreServicio, String descripcionServicio, double precioServicio, String disponibilidadServicio){
        this.idServicios = idServicios;
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
        this.disponibilidadServicio = disponibilidadServicio;
    }
    //Getters and Setterers
    public String getIdServicios(){
        return idServicios;
    }
    public void setIdServicios(String idServicios){
        this.idServicios = idServicios;
    }
    public String getNombreServicio(){
        return nombreServicio;
    }
    public void setNombreServicio(String nombreServicio){
        this.nombreServicio = nombreServicio;
    }
    public String getDescripcionServicio (){
        return descripcionServicio;
    }
    public void setDescripcionServicio(String descripcionServicio){
        this.descripcionServicio = descripcionServicio;
    }
    public double getPrecioServicio(){
        return precioServicio;
    }
    public void setPrecioServicio(double precioServicio){
        this.precioServicio = precioServicio;
    }
    public String getDisponibilidadServicio(){
        return disponibilidadServicio;
    }
    public void setDisponibilidadServicio(String disponibilidadServicio){
        this.disponibilidadServicio = disponibilidadServicio;
    }

}
