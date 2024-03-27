// javac Main.java
// cd ..
// java typeChecking.Main
// cd typeChecking
package typeChecking;

// How to check type of variable in Java:
class TypeChecker{
    void printType(int x){
        System.out.println(x + " la kieu Integer");
    }
    void printType(float x){
        System.out.println(x + " la kieu Float");
    }
    void printType(double x){
        System.out.println(x + " la kieu Double");
    }
    void printType(String x){
        System.out.println(x + " la kieu String");
    }
	void printType(Object x){ // Code sai!
        System.out.println("Da xay ra loi!");
    }
}

public class Main{
    public static void main(String[] args){
        TypeChecker TC = new TypeChecker();
        String input1 = "Hello world!";
        int input2 = 24;
        short input3 = 23;
        TC.printType(input1);
        TC.printType(input2);
        TC.printType(input3); // Sai!
    }
}