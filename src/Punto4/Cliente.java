package Punto4;

import java.util.ArrayList;

public class Cliente {
    private String nombreEmpresa;
    private ArrayList<Funcionario> personal;

    public Cliente(String nombreEmpresa){
       this.nombreEmpresa = nombreEmpresa;
        this.personal = new ArrayList<>();
    }

    public void agregarPersonal(Funcionario funcionario){
        this.personal.add(funcionario);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public ArrayList<Funcionario> getPersonal() {
        return personal;
    }
    public void setPersonal(ArrayList<Funcionario> personal) {
        this.personal = personal;
    }
}
