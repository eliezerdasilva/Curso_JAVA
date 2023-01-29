package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		
		method1();

	}
	public static void method1() {
		System.out.println("Início do método 2");
		method2();
		System.out.println("Final do método 2");
	}

	public static void method2() {
		

		Scanner ler = new Scanner(System.in);
		try {
			String[] vect = ler.nextLine().split(" ");
			int position = ler.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inválido");
			e.printStackTrace();
			ler.next();
		} catch (InputMismatchException e) {
			System.out.println("Entrada errada");
		}
		
	}
}
