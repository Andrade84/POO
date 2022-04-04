package Entities;

public class Funcionario {
	
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double netSalary() {
		return this.GrossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		double aumento = GrossSalary * (percentage / 100) + netSalary();
		System.out.println(this.name+", $"+aumento);
	}
	
	public String toString() {
		
		return "Employee: "+this.name+", $"+String.format("%.2f",netSalary());
	}

}
