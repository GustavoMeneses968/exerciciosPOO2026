package gerenciamentoCursos;

public class Prof {
    private String nome;
    private int idade;
    private String formacao;
    private String cpf;

    public Prof(String nome, int idade, String formacao, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.formacao = formacao;
    }
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
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
