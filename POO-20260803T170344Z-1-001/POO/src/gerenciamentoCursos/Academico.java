package gerenciamentoCursos;

public class Academico {
    private String nome;
    private int idade;
    private String matricula;
    private String cpf;

    public Academico(String nome, int idade, String matricula, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
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
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
