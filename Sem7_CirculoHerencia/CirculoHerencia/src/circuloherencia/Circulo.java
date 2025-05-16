package circuloherencia;

public class Circulo {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Mètodos propios de clase Padre Circulo.
    
    public double area(){
        return 3.14*Math.pow(radio, 2);
    }
    
    public double longitud(){
        return 2*Math.PI*radio;
    }
}
