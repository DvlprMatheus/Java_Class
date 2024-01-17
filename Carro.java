// Criação da classe
public class Carro {

    // Atributo modelo.
    String modelo = "Divo";

    // Atributo marca.
    String marca = "Bugatti";

    // Atributo ano.
    int ano = 2020;

    // Método criado para especificar todos os atributos do carro.
    public void testDrive(){
        System.out.println("Seja bem vindo ao Test Drive!\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nAproveite sua jornada!");
    }

    // Função principal que cria o objeto que chama o método.
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        meuCarro.testDrive();
    }
}