package Punto4;

public class Habitacion {
    private static int contadorId = 100;
    private int id;
    private String tipo;
    private boolean tieneTelevisor;
    private boolean tieneBaño;
    private boolean tieneSofa;
    private boolean estaLibre = true;
    private Funcionario huesped;

    public Habitacion(String tipo, boolean tieneTelevisor, boolean tieneBaño, boolean tieneSofa){
        this.tipo = tipo;
        this.tieneTelevisor = tieneTelevisor;
        this.tieneBaño = tieneBaño;
        this.tieneSofa = tieneSofa;
        this.id = contadorId++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isTelevisor() {
        return tieneTelevisor;
    }
    public void setTieneTelevisor(boolean tieneTelevisor) {
        this.tieneTelevisor = tieneTelevisor;
    }
    public boolean isBaño() {
        return tieneBaño;
    }
    public void setTieneBaño(boolean tieneBaño) {
        this.tieneBaño = tieneBaño;
    }
    public boolean isSofa() {
        return tieneSofa;
    }
    public void setTieneSofa(boolean tieneSofa) {
        this.tieneSofa = tieneSofa;
    }
    public boolean isLibre() {
        return estaLibre;
    }
    public void setEstaLibre(boolean estaLibre) {
        this.estaLibre = estaLibre;
    }
    public Funcionario getHuesped() {
        return huesped;
    }
    public void setHuesped(Funcionario huesped) {
        this.huesped = huesped;
    }
}
