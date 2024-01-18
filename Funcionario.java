// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Funcionario {

    // Atributo nome.
    String nome = "João Pedro";

    // Atributo cargo.
    String cargo = "Desenvolvedor Junior";

    // Atributo salário.
    double salario = 1500.00;

    // Método criado para realizar o aumento no salário, informando toda descrição do funcionário.
    static void aumentSalario(){
        // Objeto para acessar atributos.
        Funcionario funcObj = new Funcionario();

        // Input da porcentagem desejada.
        Scanner aumentObj = new Scanner(System.in);
        System.out.print("Digite a porcentagem de aumento: ");

        // Coleta de dados.
        double nmr_porcentagem = aumentObj.nextInt();

        // Conta da porcentagem e adição sobre o salário antigo, já resultando no salário atual com aumento.
        double salario_final = funcObj.salario + ((nmr_porcentagem/100) * funcObj.salario);

        // Exibição das informações.
        System.out.printf("---------- Info Funcionário ----------\nNome: %s\nCargo: %s\nSalário antigo: %.2f\nSalário atual: %.2f\n--------------------------------------", funcObj.nome, funcObj.cargo, funcObj.salario, salario_final);
    }

    // Função principal que chama o método.
    public static void main(String[] args){
        aumentSalario();
    }
}
