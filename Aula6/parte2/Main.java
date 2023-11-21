package parte2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(2.0);
        Retangulo r = new Retangulo(2.0, 3.0);
        Circulo c = new Circulo(2.0);

        ArrayList<AreaCalculavel> formasGeometricas = new ArrayList<AreaCalculavel>();

        formasGeometricas.add(q);
        formasGeometricas.add(r);
        formasGeometricas.add(c);

    for (AreaCalculavel i : formasGeometricas) {
        System.out.println(i.calculaArea());
    }

        
    }
}
