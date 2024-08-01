public class Livro implements Publicacao{

    //<editor-fold desc="Atributos">
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //</editor-fold>

    //<editor-fold desc="Construtor">

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }


    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public int getPagAtual(){
        return pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //</editor-fold>

    //<editor-fold desc="Ações">

    public String detalhes() {
        return "Livro{" +
                "\n Título='" + titulo +
                ",\n Autor='" + autor +
                ",\n Total de Páginas = " + totPaginas +
                ",\n Página atual = " + pagAtual +
                ",\n Aberto = " + aberto +
                ",\n Leitor = " + leitor.getNome() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void proxPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual --;
    }

    //</editor-fold>


}
