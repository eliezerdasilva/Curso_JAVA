package application_contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.SimpleAttributeSet;

import entities.enums.WorkerLevel;
import entities_contrato.Department;
import entities_contrato.HourContract;
import entities_contrato.Worker;

public final class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		HourContract contract ;
		
		System.out.println("Informe o nome do departamento");
		String departmentName = ler.nextLine();
		
		System.out.println("Insira os dados do trabalho");
	
		System.out.print("Informe o  Nome");
		String workerName = ler.nextLine();
		 
		System.out.print("Level: JUNIOR,\r\n"
				+ "	MID_LEVEL,\r\n"
				+ "	SENIOR; ");
		
		String workerLevel = ler.nextLine();
		
		System.out.print("Salario Base");
		Double baseSalary = ler.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		
		System.out.println("Quantos contratos tem?  ");
		int n = ler.nextInt();
		
		for (int i = 1 ; i<=n; i++) {
			System.out.println("Contrato N"+ i+ "data:");
			System.out.print("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(ler.next());
			System.out.println("Valor por hora");
			double valuePerHour = ler.nextDouble();
			System.out.println("Duração:");
			int hours = ler.nextInt();
			contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		
		
		}
		
		System.out.println();
		System.out.println("Entre com mes e ano para ver o salario(MM/YYYY):");
		String monthAndYear = ler.next();
		int month =Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name "+ worker.getName());
		System.out.println("Department"+ worker.getDepartment().getName());
		System.out.println("salario mês " + monthAndYear + ": " +String.format("%.2f", worker.income(year,month)));
	ler.close();
	}

}
