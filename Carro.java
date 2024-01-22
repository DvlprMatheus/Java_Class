// Criação da classe.
public class Carro {

    // Atributos.
    private String modelo;
    private String marca;
    private int ano;

    // Métodos Getter e Setter para manipular os atributos.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Função principal que altera os atributos e exibe ao usuário.
    public static void main(String[] args) {
        Carro car = new Carro();

        car.setModelo("Divo");
        car.setMarca("Bugatti");
        car.setAno(2020);

        System.out.println("---------- Informações do Carro ----------\nModelo: " + car.getModelo() + "\nMarca: " + car.getMarca() + "\nAno: " + car.getAno() +"\n------------------------------------------");
    }
}