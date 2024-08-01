public class Pessoa {

    //<editor-fold desc="Atributos">
    private String nome;
    private int idade;
    private char sexo;
    //</editor-fold>

    //<editor-fold desc="Construtor">
    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //</editor-fold>

    //<editor-fold desc="Ações">
    public void fazerAniversario(){
        this.idade++;
    }
    //</editor-fold>
}