package co.edu.uniquindio;

class Desarrollador {
    private String codigo;
    private String equipo;
    private String nivel; // Junior, Semisenior, Senior
    private int maxProyectos; // Tipo int
    private double tarifaDia; // Tipo double
    private String estado; // Disponible, Asignado, Ocupado, En capacitacion

    public Desarrollador(String codigo, String equipo, String nivel, int maxProyectos, double tarifaDia, String estado) {
        this.codigo = codigo;
        this.equipo = equipo;
        this.nivel = nivel;
        this.maxProyectos = maxProyectos;
        this.tarifaDia = tarifaDia;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public int getMaxProyectos() { return maxProyectos; }
    public void setMaxProyectos(int maxProyectos) { this.maxProyectos = maxProyectos; }
    public double getTarifaDia() { return tarifaDia; }
    public void setTarifaDia(double tarifaDia) { this.tarifaDia = tarifaDia; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String mostrarInfo() {
        return "Cód: " + codigo + " | Equipo: " + equipo + " | Nivel: " + nivel + " | Tarifa/Día: $" + tarifaDia + " | Estado: " + estado;
    }
}