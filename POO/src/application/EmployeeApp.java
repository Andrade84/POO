package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class EmployeeApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		
		System.out.print("Gross Salary: $ ");
		func.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(func.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		System.out.println();
		System.out.println("Updated data: ");
		func.increaseSalary(percentage);
		
		
		sc.close();

	}

}
