/* Kiểm tra số đối xứng trong Java */

// javac KiemTraSoDoiXung.java
// java KiemTraSoDoiXung
import java.util.Scanner;

public class KiemTraSoDoiXung{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Sử dụng class Scanner để lấy dữ liệu từ bàn phím.
        // Khai báo biến num1 là số cần kiểm tra đối xứng,
        // reversed là số sau khi đảo ngược num1,
        // còn original là biến để lưu lại số num1 gốc.
        int num1, reversed = 0, original;

        System.out.println("Vui long nhap vao so can kiem tra: ");
        num1 = sc.nextInt();
        sc.close();
        original = num1; // Gán giá trị vừa nhập vào cho biến original để so sánh với reversed.
        
        // Dùng vòng lặp while để đảo ngược num1:
        while(num1 != 0) {
            int digit = num1 % 10;
            num1 /= 10;
            reversed = reversed * 10 + digit;
        }

        // So sánh reversed (số đảo ngược) với original (số ban đầu):
        if(reversed == original){ 
            System.out.println(original+ " la so doi xung");
        }else{
            System.out.println(original+ " khong phai so doi xung");
        }
    }
}