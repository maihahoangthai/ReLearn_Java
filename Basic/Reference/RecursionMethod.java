// javac RecursionMethod.java
// java RecursionMethod

/* Đặc trưng của Hồi quy:
 * gọi x là Argument của hàm hồi quy f().
 * 1. Hàm phải có vòng lập if-else
 * 2. Nếu đúng, return (x + f(x-1))
 * 3. Nếu sai, return một value cụ thể nào đó như 5, 10, 2, 0, v.v. hoặc x
 */
public class RecursionMethod{
    public static void main(String[] args){
        System.out.print("Sum[5, 10] = ");
        System.out.print(SumCal(5, 10) + "\n"); // "5" và "10" là Arguments.
    }

    // Tính Tổng của các số trong khoảng từ [Số thứ nhất, Số thứ hai].
    // Ví dụ: [5, 10] => 5 + 6 + 7 + 8 + 9 + 10 = 45
    static int SumCal(int start, int end){ // "int start" và "int end" là Parameters.
        if(start < end){
            return end + SumCal(start, end-1);
        }else{
            return end;
        }
    }

}