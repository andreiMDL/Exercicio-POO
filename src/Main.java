public class Main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Andrei", 20, 'M');
        p[1] = new Pessoa("Malu", 18, 'F');

        l[0] = new Livro("A Arte da Guerra", "Sun tzu", 85, p[0]);
        l[1] = new Livro("Cristianismo Puro e Simples", "C.S. Lewis", 296, p[1]);
        l[2] = new Livro("Atos dos Apóstolos", "Lucas", 30, p[0]);

        l[0].abrir();
        l[0].folhear(60);
        System.out.println(l[0].detalhes());
    }
}
