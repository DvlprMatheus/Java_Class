// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Triangulo {

    // Atributo primeiro lado.
    int lado1 = 0;

    // Atributo segundo lado.
    int lado2 = 0;

    // Atributo terceiro lado.
    int lado3 = 0;

    // Objeto Global.
    static Triangulo triangObj = new Triangulo();

    // Método que realiza a verificação do triângulo.
    static void valObj(){
        if(triangObj.lado1 == triangObj.lado2 && triangObj.lado1 == triangObj.lado3){
            System.out.println("O triângulo é válido!");
        } else {
            System.out.println("O triângulo não é valido!");
        }
    }

    // Função principal que coleta os dados e inicia o método.
    public static void main(String[] args){

        // Input do primeiro lado.
        Scanner lado1Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do primeiro lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado1 = lado1Obj.nextInt();

        // Input do segundo lado.
        Scanner lado2Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do segundo lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado2 = lado2Obj.nextInt();

        // Input do terceiro lado.
        Scanner lado3Obj = new Scanner(System.in);
        System.out.print("Digite o tamanho do terceiro lado do triângulo: ");

        // Coleta de Dados.
        triangObj.lado3 = lado3Obj.nextInt();

        // Chamada do método.
        valObj();
    }
}
