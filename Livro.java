// Criação da classe.
public class Livro {

    // Atributos.
    private String titulo;
    private String autor;
    private int anoPublicado;

    // Métodos Getter e Setter para manipular os atributos.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    // Função principal que setta os atributos e exibe a descrição do livro.
    public static void main(String[] args){
        Livro book = new Livro();

        book.setTitulo("A Paciente Silenciosa");
        book.setAutor("Alex Michaeledes");
        book.setAnoPublicado(2019);

        System.out.printf("---------- Descrição do Livro ----------\nTitulo: %s\nAutor: %s\nAno Publicado: %d\n----------------------------------------", book.getTitulo(),book.getAutor(), book.getAnoPublicado());
    }
}