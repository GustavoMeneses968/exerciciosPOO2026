package gerenciamentoCursos;

import java.util.LinkedList;

public class Sala {
    private String nome;
    private LinkedList<Academico> academicos = new LinkedList<>();
    private LinkedList<Prof> prof = new LinkedList<>();
    private LinkedList<Disciplina> disciplinas = new LinkedList<>();


    public LinkedList<Academico> getAcademicos() {
        return academicos;
    }
    public void setAcademicos(LinkedList<Academico> academicos) {
        this.academicos = academicos;
    }
    public LinkedList<Prof> getProf() {
        return prof;
    }
    public void setProf(LinkedList<Prof> prof) {
        this.prof = prof;
    }
    public LinkedList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(LinkedList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adcionarAlunos(Academico academico){
        academicos.add(academico);
    }
    public void adcionarProf(Prof professor){
        prof.add(professor);
    }

    public void adcionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}

