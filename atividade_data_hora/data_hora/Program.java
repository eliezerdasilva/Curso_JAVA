package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public  final class Program {

	public static void main(String[] args) {
		
		//Para arrumar a data 
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");	
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		// ver local e adicionar no final 
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		
		//datetimeformater Documentacao da hora 
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		
		//--------------
		
		//  dia/mes/ano
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");	
		//Formatacao com o horario do computador
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());	
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
		
		//Maneiras 
		System.out.println("d04 = " + d04.format(fmt01));
		System.out.println("d04 = " + fmt01.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt02));
		System.out.println("d05 = " + d05.format(fmt04));
		
		System.out.println("d06 = " + fmt03.format(d06));
		System.out.println("d06 = " + fmt05.format(d06));
	
		//-------------
		
		// Nome de lugares de horario
		
		/*
		  for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		*/
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		
		//dia
		System.out.println("d04 dia = "+ d04.getDayOfMonth());
		//mes
		System.out.println("d04 dia = "+ d04.getMonthValue());
		//ano
		System.out.println("d04 dia = "+ d04.getYear());
		//hora
		System.out.println("d05 dia = "+ d05.getHour());
		//minuto
		System.out.println("d05 dia = "+ d05.getMinute());
		
		//-------------- 
		
		
		//diminui ou adiciona dias minus plus
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
		System.err.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = "+ pastWeekLocalDateTime);
		System.err.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = "+ pastWeekInstant);
		System.err.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0 , 0));
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0 , 0));
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t03 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t1 dias = " + t01.toDays());
		
		System.out.println("t2 dias = " + t2.toDays());
		
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t3 dias = " + t03.toDays());
	
	}
	

}
