package Punto4;

import Punto1.Alumno;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    public Hotel(String nombre){
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitaciones(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }

    public void listarHabitacionesDisponibles(){
        System.out.println("Listado de habitaciones disponibles para el hotel " +  this.nombre);
        for (Habitacion habitacion: habitaciones){
            if(habitacion.isLibre() == true){
                System.out.println("Habitación " + habitacion.getId() + " - tipo: " + habitacion.getTipo());
            }
        }
    }

    public void reservarHabitaciones(Cliente cliente){
        System.out.println("Nombre de la empresa que reservo: " + cliente.getNombreEmpresa());
        int index = 0;
        for (Habitacion habitacion: habitaciones){
            if (habitacion.isLibre() == true){
                habitacion.setHuesped(cliente.getPersonal().get(index));
                habitacion.setEstaLibre(false);
                System.out.println(
                        "El funcionario " + cliente.getPersonal().get(index).getNombre() +
                                " con cédula " + cliente.getPersonal().get(index).getCedula() +
                                " se alojará en la habitación número " + habitacion.getId());
            }
            index += 1;
            if(index == cliente.getPersonal().size()){
                break;
            }
        }
    }

    public void cancelarReservas(Cliente cliente){
       for (Funcionario funcionario: cliente.getPersonal()){
           for (Habitacion habitacion: habitaciones){
               if(habitacion.isLibre() == false){
                   if(funcionario.getCedula() == habitacion.getHuesped().getCedula()){
                       habitacion.setEstaLibre(true);
                   }
               }
           }
       }
        System.out.println("La cancelación de la reserva para la empresa " + cliente.getNombreEmpresa() + " fue realizada con éxito");
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
