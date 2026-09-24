package co.edu.uniquindio;

public class Cliente {
    // Atributos
    private String nombreCliente;
    private String idCliente;
    private int telefonoCliente;
    private String emailCliente;
    private String paisCliente;

    private Proyecto [] listProyectos;

    // Constructor
    public Cliente (String nombreCliente,String idCliente,int telefonoCliente, String emailCliente,String paisCliente){
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.paisCliente = paisCliente;

        listProyectos = new Proyecto [10];
    }
    // Getters and Setters
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getIdCliente(){
        return idCliente;
    }
    public void setIdCliente( String idCliente){
        this.idCliente = idCliente;
    }
    public int getTelefonoCliente (){
        return telefonoCliente;
    }
    public void setTelefonoCliente(int telefonoCliente){
        this.telefonoCliente = telefonoCliente;
    }
    public String getEmailCliente (){
        return emailCliente;
    }
    public void setEmailCliente(String emailCliente){
        this.emailCliente = emailCliente;
    }
    public String getPaisCliente (){
        return paisCliente;
    }
    public void setPaisCliente (String paisCliente){
        this.paisCliente = paisCliente;
    }



}
