package Facade;

public class ReservaHotel {
	 public void realizarReserva(String dataCheckIn, String dataCheckOut, int numAdultos, int numCriancas) {
	        System.out.println("Reserva de hotel realizada para " + numAdultos + " adultos e " + numCriancas + " crianças.");
	        System.out.println("Check-in: " + dataCheckIn + " | Check-out: " + dataCheckOut);
	        System.out.println("Quarto(s) reservado(s) com sucesso!");
	    }
}
