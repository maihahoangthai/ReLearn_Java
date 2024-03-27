// javac basic.java
// java basic
import java.util.*;
// import java.util.Scanner;
// import java.lang.Math;

public class basic{
    public static void main(String[] args){
        // String không phải một Primitive data type.
        // 8 Primitive: byte, short, int, long, float, double, boolean và char.
        // long > int > short > byte
        // double > float
        byte myByte = 1; 
        final short myShort = 2; // Dùng "final" nếu không muốn Variable bị sửa đổi dù với bất cứ lý do gì.
        int myInt = 3;
        final long myLong = 4;
        float myFloat = 0.5f; // kết thúc bằng ký tự f
        double myDouble = 0.678d; // kết thúc bằng ký tự d
        boolean myBoolean = true;
        char myChar = 'T'; // Khác String, khai báo phải dùng '' thay vì "".
        System.out.println(myByte + " " + myShort + " " + myInt + " " + myLong + " " + myFloat + " " + myDouble + " " + myBoolean + " " + myChar);

        // Data Type Casting:
        double myDouble2 = myByte; // Convert small -> big.
        byte myByte2 = (byte) Math.round(myDouble);// Convert big -> small.
        System.out.println("Before DataTypeCasting: " + myByte + " & " + myDouble);
        System.out.println("After DataTypeCasting: " + "\n Byte -> Double: " + myDouble2 + "\n Double -> Byte: " + myByte2);

        // Enter 2 number:
        try {
            Scanner myScan = new Scanner(System.in);
            System.out.print("Your 1st number is: ");
            String input1 = myScan.nextLine();
            System.out.print("Your 2nd number is: ");
            String input2 = myScan.nextLine();
            double sumXY = Double.parseDouble(input1) + Double.parseDouble(input2);
            System.out.println("=> X + Y = " + sumXY);
            myScan.close();
        } catch (Exception e) { // Nếu có lỗi thì báo lỗi.
            System.out.println("Exception thrown:\n" + e); 
        } finally{
            System.out.println("Kệ Try-Catch bị lỗi hay không, đoạn code nằm trong block này vẫn chạy!");
        }

        // Method example:
        simpleMethod();
        simpleMethod(10);
        int howOldAreYou = myAgeMethod(23);
        System.out.println("-> Thai is " + howOldAreYou + " year old.");
        System.err.println("How old are you? " + myAgeMethod(6));

        // Recursion method:
        System.out.println("Sum(start = 5, end = 10): " + mySum(5, 10));
    }

    // Method example:
    static void simpleMethod(){
        System.out.println("I\'m Hoang Thai!\\'");
    }
    static void simpleMethod(int numOfPrint){
        System.out.println("Day so Fibonacci " + "tu vi tri 0 den vi tri " + numOfPrint + " la: ");
        for(int index=0; index<numOfPrint; index++){
            System.out.print(fibonacci(index) + " ");
        }
        System.out.println("");
    }
    static int fibonacci(int index) {
        int f0 = 0; // Số fibonacci ở vị trí xuất phát (index=0)
        int f1 = 1; // Số fibonacci ở vị trí index=1
        int fn = 1; // Số fibonacci ở vị trí index=2
        if (index < 0) {
            return -1;
        } else if (index == 0 || index == 1) {
            return index; // Bởi 2 số đầu tiên của dãy Fibonacci có giá trị đúng bằng với vị trí index của chúng.
        } else {
            // Skip block này nếu stt=2 và return fn=1;
            for (int i = 2; i < index; i++) {
                // Dò xem ở vị trí index, thì có số Fibonacci là gì.
                f0 = f1;
                f1 = fn;
                fn = f0 + f1; 
            }
        }
        return fn;
    }
    static int myAgeMethod(int age){
        String result = (age>18) ? "Access granted! You're older than 18." : "Access denied... You're not 18 yet...";
        System.out.println(result);
        return age;
    }
    
    // Recursion method:
    static int mySum(int start, int end){
        if (start < end){
            return end + mySum(start, end-1);
        }
        else{
            return end;
        }
    }
}