package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class StudantApp {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();
		
		std.nome = sc.nextLine();
		std.n1 = sc.nextDouble();
		std.n2 = sc.nextDouble();
		std.n3 = sc.nextDouble();
		
		std.media();
		sc.close();
	}

}
