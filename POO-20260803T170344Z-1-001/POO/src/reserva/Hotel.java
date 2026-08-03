package reserva;

import java.util.LinkedList;

public class Hotel {
    private String nome;
    private String estado;
    private String cidade;
    private int numero;
    private LinkedList<Quarto> quartos = new LinkedList<>();


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public LinkedList<Quarto> getQuartos() {
        return quartos;
    }
    public void setQuartos(LinkedList<Quarto> quartos) {
        this.quartos = quartos;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void adicionarQuartos(Quarto quarto){
        quartos.add(quarto);
    }
}
