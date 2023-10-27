public class Televisao {
    boolean isLigada;

    public void power() {
        this.isLigada = !this.isLigada;
        this.observar();
    }

    public void observar() {
        if (isLigada) {
            System.out.println("Tv ligada");
        }
        else {
            System.out.println("Tv desligada");
        }
    }


}
