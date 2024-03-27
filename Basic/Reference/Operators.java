public class Operators{
    /* Operators = Toán tử */
    public static void main(String[] args){
        int myNum = 2;
        int myAge = 23;
        String myName = "Hoang Thai";
        System.out.println(myName + " is " + myAge + " year old!");
        System.out.println("myNum before: " + myNum);
        ++myNum;
        System.out.println("myNum after: " + myNum);
        System.out.println("myAge % myNum: " + myAge % myNum);
        myAge += 1;
        System.out.println("myAge after using += 1: " + myAge);
        System.out.println("(myAge >= 18) && (myAge <= 80) -> " + ((myAge >= 18) && (myAge <= 80)));
        System.out.println("(myAge >= 18) || (myAge < 0) -> " + ((myAge >= 18) || (myAge < 0)));
    }
}