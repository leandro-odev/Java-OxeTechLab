package parte2;

public class Retangulo implements AreaCalculavel {
    Double lado;
    Double lado2;

    Retangulo(Double lado, Double lado2){
        this.lado = lado;
        this.lado2 = lado2;
    }
    
    public double calculaArea(){
        return lado * lado2;
    }
}
