// javac Payroll.java PayrollDriver.java
// cd ..
// dir
// java dapAn.PayrollDriver
// cd dapAn
package dapAn;

class PayrollDriver {
    public static void main(String[] args){
        Payroll employee1 = new Payroll("Hoang Thai", 1);
        employee1.setPayRate(5);
        employee1.setHoursWork(8);
        System.out.println("Your Data: " + employee1.toString());
		System.out.println("-> Your Gross Pay is = " + employee1.getGrossPay());
	}
}