package reserva;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Quarto quarto = new Quarto();
        Reserva reserva = new Reserva();
        Hospede hospede = new Hospede("Meneses");

        quarto.setNumero(159);
        quarto.setLuxo(false);
        quarto.setStandart(true);
        hotel.setNome("Bananildo");
        hotel.setEstado("Paraná");
        hotel.setCidade("Toledo");
        hotel.setNumero(177);
        reserva.adicionarHospede(hospede);
        hotel.adicionarQuartos(quarto);

    }

}
