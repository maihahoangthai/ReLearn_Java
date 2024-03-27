// javac NhapDaySoBK1.java
// java NhapDaySoBK1
import java.util.Scanner;

public class NhapDaySoBK1 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
		int sum = 0, number = -1000;
        do{
            String input = myScan.nextLine();
            number = Integer.parseInt(input);

            if(number == -1){ // Nhập -1 để kết thúc quá trình nhập liệu
                System.err.println("Sum = " + sum);
                myScan.close();
                break;
            }

            sum += number; // Kết quả cuối cùng không bao gồm -1
        }while(true);
    }
}
