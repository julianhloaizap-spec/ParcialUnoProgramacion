package co.edu.uniquindio;

public class ServicioAdicional {
    // Atributos
    private String idServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private double precioServicio; // Tipo double
    private boolean disponibleServicio;

    //Constructor
    public ServicioAdicional(String idServicio, String nombreServicio, String descripcionServicio, double precioServicio, boolean disponibleServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
        this.disponibleServicio = disponibleServicio;
    }
    //Getters and Setterers
    public String getIdServicio() {
        return idServicio;
    }
    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }
    public String getNombreServicio() {
        return nombreServicio;
    }
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
    public String getDescripcionServicio() {
        return descripcionServicio;
    }
    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }
    public double getPrecioServicio() {
        return precioServicio;
    }
    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }
    public boolean isDisponibleServicio() {
        return disponibleServicio;
    }
    public void setDisponibleServicio(boolean disponibleServicio) {
        this.disponibleServicio = disponibleServicio;
    }

    public String mostrarInfo() {
        return "Cód: " + idServicio +
                " | Nombre: " + nombreServicio +
                " | Precio: $" + precioServicio +
                " | Disponible: " + (disponibleServicio ? "Sí" : "No");
    }
}
