package Facade;

class SistemaReservaHotel {
    private ReservaHotel reservaHotel;
    private VerificacaoDisponibilidade verificacaoDisponibilidade;
    private Pagamento pagamento;

    public SistemaReservaHotel() {
        reservaHotel = new ReservaHotel();
        verificacaoDisponibilidade = new VerificacaoDisponibilidade();
        pagamento = new Pagamento();
    }

    public void realizarReservaHotel(String dataCheckIn, String dataCheckOut, int numAdultos, int numCriancas) {
        boolean disponibilidade = verificacaoDisponibilidade.verificarDisponibilidade(dataCheckIn, dataCheckOut);

        if (disponibilidade) {
            reservaHotel.realizarReserva(dataCheckIn, dataCheckOut, numAdultos, numCriancas);
            double valorTotal = calcularValorTotal(dataCheckIn, dataCheckOut, numAdultos, numCriancas);
            pagamento.realizarPagamento(valorTotal);
        } else {
            System.out.println("Não há quartos disponíveis para o período selecionado.");
        }
    }

    private double calcularValorTotal(String dataCheckIn, String dataCheckOut, int numAdultos, int numCriancas) {
        double valorDiaria = 100.0; 
        int numDias = 5;
        int numPessoas = numAdultos + numCriancas;
        return valorDiaria * numDias * numPessoas;
    }
}
