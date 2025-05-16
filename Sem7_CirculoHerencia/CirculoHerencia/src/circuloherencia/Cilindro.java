package circuloherencia;

public class Cilindro extends Circulo {
    
    private double altura;

    public Cilindro(double altura, double radio) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    //Clase Cilindro Hijo.
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override //Se utiliza para indicar que un método en una clase hija está sobrescribiendo un método de la clase padre.
    public double area(){
        return 3.14*Math.PI*getRadio()*(getRadio() + altura);
    }
    
    public double volumen(){
        return Math.PI*altura*Math.pow(getRadio(), 2);
    } 
}
