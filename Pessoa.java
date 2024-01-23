// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Pessoa {

    // Atributos.
    private String nome;
    private int idade;
    private double altura;

    // Métodos Setter para manipular os atributos.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setValIdade(){
        if(idade > 18) {
            System.out.printf("Seu nome é %s, você tem %.2f de altura.\nE você é maior de idade!", nome, altura);
        } else {
            System.out.printf("Seu nome é %s, você tem %.2f de altura.\nE você é maior de idade!", nome, altura);
        }
    }

    // Função principal que setta os atributos e valida a idade digitada pelo usuário.
    public static void main(String[] args) {
        Pessoa people = new Pessoa();

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            people.setNome(scan.nextLine());

            System.out.print("Digite sua idade: ");
            people.setIdade(scan.nextInt());

            System.out.print("Digite sua altura: ");
            people.setAltura(scan.nextDouble());

            people.setValIdade();

        } catch (Exception e) {
            System.out.println("Valor Inválido");
        }
    }
}