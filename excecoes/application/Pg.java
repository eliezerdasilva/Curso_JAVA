package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Pg {
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
try {
		System.out.println("Número do Quarto");
		int number = ler.nextInt();
		System.out.println("Data de check-in (dd/MM/yyyy) ");
		Date checkIn = sdf.parse(ler.next());
		System.out.println("Data de check-Out (dd/MM/yyyy) ");
		Date checkOut = sdf.parse(ler.next());
		
		
		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservado"+ reservation);
		
		System.out.println();
		System.out.println("Entre com as data para reservar");
		System.out.println("Data de check-in (dd/MM/yyyy) ");
		checkIn = sdf.parse(ler.next());
		System.out.println("Data de check-Out (dd/MM/yyyy) ");
		checkOut = sdf.parse(ler.next());
		
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservado"+ reservation);
		}

	catch(ParseException e) {
		System.out.println("Data informada incorreta.");
		}
	catch(DomainException	 e) {
		System.out.println("Erro na reserva" + e.getMessage()); 
	}
	catch(RuntimeException e) {
		System.out.println("Erro inesperado");
	}
	}
}


