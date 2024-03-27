/*
- Số Hoàn Hảo là số nguyên dương (int>1) có Tổng các ước số (số int mà nó chia hết %==0) bằng chính nó (ví dụ: 28; 6 == 1+2+3).
+ Bước 1: nếu n < 2, thì kết luận n không phải Số hoàn thiện. 
+ Bước 2: lặp từ i=1 tới (n-1), tiến hành sum += i nếu phát hiện n chia hết cho i (Hay n%i == 0) đang xét.
+ Bước 3: nếu sum == n thì tức là Số hoàn chỉnh.
*/
public class SoHoanHao {
    public static void main(String[] args) {
        System.out.println("Nhung so hoan hao nho hon 100 la: ");
        for (int i = 0; i < 100; i++) {
            if (CheckSoHoanHao(i) == true) {
                System.out.print(i + " ");
            }
        }
        
    }

    public static boolean CheckSoHoanHao(int y){
        if (y < 2) { // Nếu n <= 1 thì tức không phải Số Hoàn hảo.
            return false;
        }

        int sum = 0;
        for (int i = 1; i < y; i++) {
            if (y % i == 0) {
                sum += i; // Nếu đúng là Ước số thì tiến hành cộng vào Sum để so sánh.
            }
        }
        if(sum == y){
            return true;
        }else{
            return false;
        }
    }

}
