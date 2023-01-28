package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Informe a quantidade de funcionarios");
		int n = ler.nextInt();
		
		
 		for(int i=1;i<=n;i++) {
 			System.out.println("Funcionario #"+ i + "data: ");
 			System.out.println("É tercerizado (y/n)");
 			char ch = ler.next().charAt(0);
 			System.out.println("Nome: ");
 			ler.nextLine();
 			String name = ler.nextLine();
 			System.out.print("horas: ");
 			int horas = ler.nextInt();
 			System.out.println("Valor por hora");
 			double valuePerHour = ler.nextDouble();
 			if(ch =='y') {
 				System.out.println("Taxa adicional");
 				double  additionalCharge = ler.nextDouble();
 				list.add(new OutsourcedEmployee(name, horas, valuePerHour, additionalCharge));
 			}else {
 		
 				list.add( new Employee(name, horas, valuePerHour));
 			}
 			
 			
 		}
		
 		System.out.println();
 		System.out.println("PAYMENTS");
		for(Employee emp : list) {
			System.out.println(emp.getName()+ " - $" + String.format("%.2f",emp.payment()));
		}
		ler.close();
		
	}

}
