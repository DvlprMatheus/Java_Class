// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Triangulo {

    // Atributos.
    private int lado1;
    private int lado2;
    private int lado3;
    private boolean valTriangulo;

    // Métodos Getter e Setter para manipular os atributos.
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public boolean getValTriangulo() {
        return valTriangulo;
    }

    public void setValTriangulo() {
        valTriangulo = lado1 == lado2 && lado1 == lado3;
    }

    // Função principal que setta os atributos e verifica se o triângulo é válido.
    public static void main(String[] args){
        Triangulo triangle = new Triangulo();

        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Digite o valor do primeiro lado: ");
            triangle.setLado1(scan.nextInt());

            System.out.print("Digite o valor do segundo lado: ");
            triangle.setLado2(scan.nextInt());

            System.out.print("Digite o valor do terceiro lado: ");
            triangle.setLado3(scan.nextInt());

            triangle.setValTriangulo();

            if(triangle.getValTriangulo()){
                System.out.println("Este triangulo é válido!");
            } else {
                System.out.println("Este triangulo não é válido!");
            }
        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}