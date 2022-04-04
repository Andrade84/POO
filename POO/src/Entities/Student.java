package Entities;

public class Student {

	public String nome;
	public double n1,n2,n3;
	
	public void media() {
		double soma = n1 + n2 + n3;
		System.out.println("FINAL GRADE = "+soma);
		if(soma >= 60) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAILED");
			System.out.println("MISSING "+Math.abs(60 - soma)+" POINTS");
		}
		
	}
	
}
