// Criação da classe.
public class Aluno {

    // Atributo.
    private String nome;
    private double media;

    // Métodos Getter e Setter para manipular os atributos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double pmrNota, double sgdNota, double trcNota) {
        media = (pmrNota + sgdNota + trcNota)/3;
    }

    // Função principal que setta os atributos, e exibe ao usuário.
    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel Damasceno");
        aluno.setMedia(5, 8, 9);

        System.out.printf("---------- Médias Escolares ----------\n%s = %.1f", aluno.getNome(), aluno.getMedia());

        aluno.setNome("Monyke Angel");
        aluno.setMedia(9, 7, 5.7);

        System.out.printf("\n%s = %.1f", aluno.getNome(), aluno.getMedia());

        aluno.setNome("Ariany Silva");
        aluno.setMedia(8, 6.4, 10);

        System.out.printf("\n%s = %.1f\n--------------------------------------", aluno.getNome(), aluno.getMedia());
    }
}