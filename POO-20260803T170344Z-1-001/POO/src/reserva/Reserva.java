package reserva;
import java.util.LinkedList;

public class Reserva {
    private float conta;
    private int quantQuarto;
    private int quantPessoaPorQuarto;
    private boolean check_in;
    private boolean check_out;
    private LinkedList<Hospede> hospedes = new LinkedList<>();


    public float getConta() {
        return conta;
    }
    public void setConta(float conta) {
        this.conta = conta;
    }
    public int getQuantQuarto() {
        return quantQuarto;
    }
    public void setQuantQuarto(int quantQuarto) {
        this.quantQuarto = quantQuarto;
    }
    public int getQuantPessoaPorQuarto() {
        return quantPessoaPorQuarto;
    }
    public void setQuantPessoaPorQuarto(int quantPessoaPorQuarto) {
        this.quantPessoaPorQuarto = quantPessoaPorQuarto;
    }
    public boolean isCheck_in() {
        return check_in;
    }
    public void setCheck_in(boolean check_in) {
        this.check_in = check_in;
    }
    public boolean isCheck_out() {
        return check_out;
    }
    public void setCheck_out(boolean check_out) {
        this.check_out = check_out;
    }
    public void adicionarHospede(Hospede hospede){        
        hospedes.add(hospede);
    }
}
