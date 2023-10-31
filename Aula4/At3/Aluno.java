package At3;

public class Aluno extends Pessoa {
    float[] notas = new float[4];

    public Aluno(String nome, int idade, String cpf, float[] notas) {
        super(nome, idade, cpf);
        this.notas = notas;
        
    }

    public String getStatus () {
        float notasTotal = 0;
        for(int i = 0; i < 4; i++) {
            notasTotal = notasTotal + this.notas[i];
        }

        if(notasTotal/notas.length >= 7)
        {
            return "Passou";
        }
        else {
            return "Reprovou";
        }
    }
}
