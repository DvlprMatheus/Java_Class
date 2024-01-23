// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Retangulo {

    // Atributos.
    private int comprimento;
    private int altura;

    // Métodos Getter e Setter para manipular os atributos.
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setArea(int comprimento, int altura){
        int areaRetangulo = comprimento * altura;
        System.out.println("A área do retângulo é: " + areaRetangulo);
    }

    // Função principal que recolhe a resposta do usuário, e retorna a área.
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Digite o comprimento: ");
            retangulo.setComprimento(scan.nextInt());

            System.out.print("Digite a altura: ");
            retangulo.setAltura(scan.nextInt());

            retangulo.setArea(retangulo.getComprimento(), retangulo.getAltura());
        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}