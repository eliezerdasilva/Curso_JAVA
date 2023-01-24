package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import entities.Comment;
import entities.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		ImageIcon icon = new ImageIcon("C:\\Users\\frete\\Documents\\Curso_JAVA\\exercicio_post\\imagens\\aviao.png");
		
		Comment c1 = new Comment("Boa viagem");
		Comment c2 = new Comment("Que maravilhosos");
		Post p1 = new Post(sdf.parse("21/06/2018 12:05:44"), 
				"Viajando para nova Zelandia", 
				"Vou visitar esse país maravilhoso!",
				 12
				);
	
	
	p1.addComment(c1);
	p1.addComment(c2);
	JOptionPane.showMessageDialog(null, p1,"Viagem", JOptionPane.INFORMATION_MESSAGE,icon);
	
	}

	
	
}
