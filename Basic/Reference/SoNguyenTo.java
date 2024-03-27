/*
- Số Nguyên Tố là số nguyên (int) lớn hơn 1, chia hết cho 1 và chỉ chia hết cho chính nó. 
+ Bước 1: nếu n < 2, thì kết luận n không phải Số nguyên tố. 
+ Bước 2: n == 2 là Số nguyên tố Chẵn duy nhất. 
+ Bước 3: lặp từ 2 tới (n-1), nếu trong khoảng này tồn tại số i mà n chia hết, thì kết luận n không phải là số nguyên tố, ngược lại n là số nguyên tố.
*/
 public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhung so nguyen to nho hon 100 la: ");
        for (int i = 0; i < 100; i++) {
            if (CheckSoNguyenTo(i) == true) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean CheckSoNguyenTo(int x){
        if (x < 2) { // Nếu n < 2 thì tức không phải Số Nguyên Tố.
            return false;
        }
        if (x == 2){ // 2 là số nguyên tố chẵn duy nhất.
            return true;
        }
        // Check số nguyên tố lớn hơn 2
        for (int i = 2; i <= (x-1); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
