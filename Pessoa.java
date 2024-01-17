// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Pessoa {

    // Atributo nome.
    String nome = "";

    // Atributo idade.
    int idade = 0;

    // Atributo altura.
    float altura = 0;

    // Objeto Global
    static Pessoa user = new Pessoa();

    // Método para validar se é maior ou menor de idade.
    static void valIdade(){
        if(user.idade >= 18){
            System.out.printf("\nSeu nome: %s\nSua idade: %d\nSua altura: %.2f\nVocê é maior de idade!\n", user.nome, user.idade, user.altura);
        } else {
            System.out.printf("\nSeu nome: %s\nSua idade: %d\nSua altura: %.2f\nVocê é menor de idade!\n", user.nome, user.idade, user.altura);
        }
    }

    // Função principal que coleta as informações e chama o método de validação.
    public static void main(String[] args){

        // Input do nome.
        Scanner nomeObj = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        // Coleta de dados.
        user.nome = nomeObj.nextLine();

        // Input da idade.
        Scanner idadeObj = new Scanner(System.in);
        System.out.print("Digite sua idade: ");

        // Coleta de dados.
        user.idade = idadeObj.nextInt();

        // Input da altura.
        Scanner alturaObj = new Scanner(System.in);
        System.out.print("Digite sua altura: ");

        // Coleta de dados.
        user.altura = alturaObj.nextFloat();

        // Chamada do método.
        valIdade();
    }
}