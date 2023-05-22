package Facade;

public class VerificacaoDisponibilidade {
	public boolean verificarDisponibilidade(String dataCheckIn, String dataCheckOut) {
        System.out.println("Verificando disponibilidade de quartos para o período de " + dataCheckIn + " a " + dataCheckOut);
        return true;
    }
}
