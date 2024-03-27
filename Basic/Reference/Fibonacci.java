// Quy luật của dãy số Fibonacci: số tiếp theo bằng tổng của 2 số trước. 
// Ngoài ra, 2 số đầu tiên của dãy Fibonacci là 0 và 1. 
// Ví dụ: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
public class Fibonacci {
    public static void main(String[] args) {
        // Print 10 số đầu tiên của dãy số fibonacci
        System.out.println("Fibonacci first 10 number: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int index) {
        int f0 = 0; // Số fibonacci ở vị trí xuất phát (index=0)
        int f1 = 1; // Số fibonacci ở vị trí index=1
        int fn = 1; // Số fibonacci ở vị trí index=2
        
        if (index < 0) {
            return -1;
        } else if (index == 0 || index == 1) {
            // Bởi 2 số đầu tiên của dãy Fibonacci có giá trị đúng bằng với vị trí index của chúng.
            return index;
        } else {
            // Skip block này nếu stt=2 và return fn=1;
            for (int i = 2; i < index; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                // Dò xem ở vị trí index, thì có số Fibonacci là gì.
            }
        }
        return fn;
    }
}