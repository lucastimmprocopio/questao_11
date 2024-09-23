class Livro {

  private String titulo;
  private String autor;
  private String editora;
  private String corCapa; 
  private int numeroPaginas; 
  private int anoPublicacao; 


  public Livro(String titulo, String autor, String editora, String corCapa, int numeroPaginas, int anoPublicacao) {
      this.titulo = titulo;
      this.autor = autor;
      this.editora = editora;
      this.corCapa = corCapa;
      this.numeroPaginas = numeroPaginas;
      this.anoPublicacao = anoPublicacao;
  }


  public String getTitulo() {
      return titulo;
  }

  public String getAutor() {
      return autor;
  }

  public String getEditora() {
      return editora;
  }

  public String getCorCapa() {
      return corCapa;
  }

  public int getNumeroPaginas() {
      return numeroPaginas;
  }

  public int getAnoPublicacao() {
      return anoPublicacao;
  }


  @Override
  public String toString() {
      return "Livro{" +
              "titulo='" + titulo + '\'' +
              ", autor='" + autor + '\'' +
              ", editora='" + editora + '\'' +
              ", corCapa='" + corCapa + '\'' +
              ", numeroPaginas=" + numeroPaginas +
              ", anoPublicacao=" + anoPublicacao +
              '}';
  }
}

public class Main {
  public static void main(String[] args) {

      Livro livro1 = new Livro("Os Inovadores", "Walter Isaacson", "Intrinseca", "Marrom, preto e cinza", 589, 2014);


      System.out.println(livro1);
  }
}
