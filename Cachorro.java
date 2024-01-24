// Criação da classe.
public class Cachorro {

    // Atributos.
    private String nome;
    private String raca;
    private int idade;


    // Métodos Getter e Setter para manipular os atributos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLatir() {
        return "Woof! Woof!";
    }

    // Função principal que setta os atributos e utiliza o método de latir.
    public static void main(String[] args){
        Cachorro dog = new Cachorro();

        dog.setNome("Andory");
        dog.setRaca("Yorkshire");
        dog.setIdade(2);

        System.out.printf("Este é %s, ele é um %s e tem %d anos!\n", dog.getNome(), dog.getRaca(), dog.getIdade());
        System.out.println(dog.getLatir());
    }
}