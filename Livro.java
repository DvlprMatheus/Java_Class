// Criação da classe.
public class Livro {

    // Atributos.
    private String titulo;
    private String autor;
    private int anoPublicado;

    // Métodos Setter para manipular os atributos.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public void setDescLivro(){
        System.out.printf("---------- Descrição do Livro ----------\nTitulo: %s\nAutor: %s\nAno Publicado: %d\n----------------------------------------", titulo, autor, anoPublicado);
    }

    // Função principal que setta os atributos e chama o método que exibe a descrição ao usuário.
    public static void main(String[] args){
        Livro book = new Livro();

        book.setTitulo("A Paciente Silenciosa");
        book.setAutor("Alex Michaeledes");
        book.setAnoPublicado(2019);

        book.setDescLivro();
    }
}