// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe
public class Retangulo {

    // Atributo comprimento.
    int comprimento = 0;

    // Atributo altura.
    int altura = 0;

    // Método criado para realizar o cálculo da área, utilizando as informação digitadas pelo usuário.
    public void meuCalculo(){
        int area = comprimento * altura;
        System.out.println("O resultado da área é: " + area);
    }

    // Função principal que cria o objeto, chama o método e coleta as informações do usuário.
    public static void main(String[] args){
        // Objeto
        Retangulo resultFinal = new Retangulo();

        // Input do comprimento.
        Scanner compObj = new Scanner(System.in);
        System.out.print("Digite o comprimento do retângulo: ");

        // Alocação da informação dentro do atributo comprimento.
        resultFinal.comprimento = compObj.nextInt();

        // Input da altura.
        Scanner largObj = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");

        // Alocação da informação dentro do atributo altura.
        resultFinal.altura = largObj.nextInt();

        // Chamada do método.
        resultFinal.meuCalculo();
    }
}
