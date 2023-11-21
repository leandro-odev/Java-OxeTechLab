package parte2;

public class Quadrado implements AreaCalculavel {
    Double lado;

    Quadrado(Double lado){
        this.lado = lado;
    }

    public double calculaArea(){
        return lado * lado;
    }
}
