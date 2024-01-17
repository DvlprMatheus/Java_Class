// Criação da classe.
public class Livro {

    // Atributo título.
    String titulo = "A Paciente Silenciosa";

    // Atributo autor.
    String autor = "Alex Michaelides";

    // Atributo ano publicado.
    int ano_publicado = 2019;

    // Método para exibir as informações do livro ao usuário.
    public void sobreLivro(){
        // Objeto criado para pegar os atributos.
        Livro livObj = new Livro();

        // Exibição dos dados
        System.out.printf("---------- Sobre o Livro ----------\nTítulo: %s\nAutor: %s\nAno Publicado: %d\n-----------------------------------\n", livObj.titulo, livObj.autor, livObj.ano_publicado);
    }

    // Função principal que inicia o método.
    public static void main(String[] args){

        // Para acessar um método public, necessita de criar um objeto.
        Livro livObj = new Livro();
        livObj.sobreLivro();
    }
}
