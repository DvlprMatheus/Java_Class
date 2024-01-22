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

    // Função principal que recolhe a resposta do usuário, calcula a área e retorna ao usuário.
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        Scanner scan = new Scanner(System.in);

        // Tenta esse bloco de código previnindo erros.
        try{
            System.out.print("Digite o comprimento: ");
            retangulo.setComprimento(scan.nextInt());

            System.out.print("Digite a altura: ");
            retangulo.setAltura(scan.nextInt());

            int areaRetangulo = retangulo.getComprimento() * retangulo.getAltura();
            System.out.println("A área do retângulo é: " + areaRetangulo);

            // Cria uma exceção que trata o erro.
        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}