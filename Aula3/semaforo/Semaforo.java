public class Semaforo {
    private String cor = "verde";

    public void mudarCor(){
        if (this.cor == "verde") {
            this.cor = "amarelo";
        }
        else if (this.cor == "amarelo") {
            this.cor = "vermelho";
        }
        else if (this.cor == "vermelho") {
            this.cor = "verde";
        }
        this.observar();
    }

    public void observar(){
        if (this.cor == "verde") {
            System.out.println("Pode prosseguir agora.");
        }
        else if(this.cor == "amarelo") {
            System.out.println("O sinal jaja ira fechar.");
        }
        else if(this.cor == "vermelho") {
            System.out.println("Parou! Não pode prosseguir agora.");
        }
    }
}
