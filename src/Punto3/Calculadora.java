package Punto3;

public class Calculadora {
    private double numero1;
    private double numero2;
    public Calculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void sumar(){
        double suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
    }
    public void restar(){
        double resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
    }
    public void multiplicar(){
        double mult = numero1 * numero2;
        System.out.println(numero1 + " * " + numero2 + " = " + mult);
    }
    public void dividir(){
        double div = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + div);
    }
}
