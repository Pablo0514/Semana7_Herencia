package circuloherencia;

import java.util.Scanner; //Còmo siemore importamos scanner

public class CirculoHerencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el radio:");
        double radio = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = sc.nextDouble();
        
        //Creando el objeto de la clase cilindro.
        Cilindro cilindro = new Cilindro(altura, radio); 
        
        System.out.println("Area: " + Math.round(cilindro.area()));
        System.out.println("Volumen: " + Math.round(cilindro.volumen()));
        System.out.println("Longitud: " + Math.round(cilindro.longitud()));
    }
}
