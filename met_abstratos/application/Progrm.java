package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Progrm {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a quantidade de forma");
		
		
		List<Shape> list = new ArrayList<>();
		int x = ler.nextInt();
		
		
		for(int i=1; i<=x; i++) {
			System.out.println("forma #"+ i + "Dados:");
			System.out.print(" Retangulo ou circulo (c/r)? ");
			char y = ler.next().charAt(0);
			System.out.println("Cor (BLACK/BLUE/RED):");
			Color color = Color.valueOf(ler.next());
			System.out.println("Informe oque se pede.");
			if(y == 'r') {
				System.out.println("largura");
				double width = ler.nextDouble();
				System.out.println("Altura");
				double height = ler.nextDouble();
				list.add(new Rectangle(color, width, height));
			
			}else {
				System.out.println("Raio :");
				double radius = ler.nextDouble();
				list.add(new Circle(color, radius));
				
				
			}
			
		}
		System.out.println();
		System.out.println("Forma da área :");
		
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		ler.close();
		
		
		
	}
}
