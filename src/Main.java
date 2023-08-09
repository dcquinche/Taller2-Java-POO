import Punto1.Alumno;
import Punto1.SistemaAlumnos;
import Punto2.ConversorMonedas;
import Punto3.Calculadora;
import Punto4.Cliente;
import Punto4.Funcionario;
import Punto4.Habitacion;
import Punto4.Hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ Punto 1 ------");
        Alumno alumno1 = new Alumno("Carolina", 12, new ArrayList<>());
        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();
        sistemaAlumnos.agregarAlumno(alumno1);
        sistemaAlumnos.asignarCalificacion(alumno1, 4.5F);
        sistemaAlumnos.asignarCalificacion(alumno1, 3.2F);
        sistemaAlumnos.asignarCalificacion(alumno1, 4.8F);
        sistemaAlumnos.calcularPromedio(alumno1);
        sistemaAlumnos.mostrarInformacion(alumno1);
        Alumno alumno2 = new Alumno("Henry", 11, new ArrayList<>());
        sistemaAlumnos.agregarAlumno(alumno2);
        sistemaAlumnos.listarAlumnos();

        System.out.println("------ Punto 2 ------");
        ConversorMonedas conversor1 = new ConversorMonedas(2500000);
        conversor1.COPaUSD();
        ConversorMonedas conversor2 = new ConversorMonedas(540.90);
        conversor2.USDaCOP();
        ConversorMonedas conversor3 = new ConversorMonedas(959);
        conversor3.EURaUSD();
        conversor3.USDaEUR();


        System.out.println("------ Punto 3 ------");
        Calculadora calculadora = new Calculadora(3,8);
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();


        System.out.println("------ Punto 4 ------");
        Funcionario funcionario1 = new Funcionario("Juan", "1382191210");
        Funcionario funcionario2 = new Funcionario("Paola", "2849450223");
        Funcionario funcionario3 = new Funcionario("Cristian", "932839393");
        Cliente empresa1 = new Cliente("EjemploEmpresa");
        empresa1.agregarPersonal(funcionario1);
        empresa1.agregarPersonal(funcionario2);
        empresa1.agregarPersonal(funcionario3);

        Habitacion habitacion1 = new Habitacion("Deluxe",true, true, false);
        Habitacion habitacion2 = new Habitacion("Tradicional", true, false, false);
        Habitacion habitacion3 = new Habitacion("Suite", true, true,true);
        Habitacion habitacion4 = new Habitacion("Sencilla", false, false, false);
        Hotel hotel1 = new Hotel("EjemploHotel");
        hotel1.agregarHabitaciones(habitacion1);
        hotel1.agregarHabitaciones(habitacion2);
        hotel1.agregarHabitaciones(habitacion3);
        hotel1.agregarHabitaciones(habitacion4);
        hotel1.listarHabitacionesDisponibles();

        hotel1.reservarHabitaciones(empresa1);
        hotel1.listarHabitacionesDisponibles();

        hotel1.cancelarReservas(empresa1);
        hotel1.listarHabitacionesDisponibles();
    }
}