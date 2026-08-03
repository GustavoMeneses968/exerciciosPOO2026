package gerenciamentoCursos;

import java.util.LinkedList;

public class Curso {
    private String nome;
    private LinkedList<Sala> salas = new LinkedList<>();
    private Sala sala = new Sala();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Sala> getSalas() {
        return salas;
    }
    public void setSalas(LinkedList<Sala> salas) {
        this.salas = salas;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public void adcionarSala(Sala sala){
        salas.add(sala);
    }

    
}
