package dapAn;

public class Payroll {
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;

	// Constructor:
    public Payroll(String n, int i){
        this.name = n;
        this.idNumber = i;
    }
    
	// Set:
    public void setName(String n){
        name = n;
    }
    public void setIdNumber(int i){
        idNumber = i;
    }
    public void setPayRate(double p){
        payRate = p;
    }
    public void setHoursWork(double h){
        hoursWorked = h;
    }

	// Get:
    public String getName(){
        return this.name;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    public double getPayRate(){
        return this.payRate;
    }
    public double getHoursWorked(){
        return this.hoursWorked;
    }

    // Calculation method:
    public double getGrossPay(){
        return hoursWorked * payRate;
    }

    // toString method:
	@Override
    public String toString(){
        return "Payroll{" + "name=" + this.name + ", idNumber=" + this.idNumber + ", payRate=" + this.payRate + ", hoursWorked=" + this.hoursWorked + "}";
    }
}