package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		rect.area();
		rect.perimeter();
		rect.diagonal();
		
		System.out.println( " AREA = "+rect.area()+"\n"
				+" PERIMETER = "+rect.perimeter()+"\n"
				+" DIAGONAL = "+rect.diagonal()+"\n");
		
		
		
		sc.close();

	}

}
