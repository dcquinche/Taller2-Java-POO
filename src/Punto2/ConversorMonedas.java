package Punto2;

public class ConversorMonedas {
    private double valor;

    public ConversorMonedas(double valor){
        this.valor = valor;
    }

    public void COPaUSD(){
        double conversion = valor * 0.00025;
        System.out.println("El valor en dólares es: " + conversion);
    }
    public void USDaCOP(){
        double conversion = valor * 4028.85;
        System.out.println("El valor en pesos colombianos es: " + conversion);
    }
    public void USDaEUR(){
        double conversion = valor * 0.91;
        System.out.println("El valor en euros es: " + conversion);
    }
    public void EURaUSD(){
        double conversion = valor * 1.10;
        System.out.println("El valor en dólares es: " + conversion);
    }
}
