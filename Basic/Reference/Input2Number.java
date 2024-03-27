import java.util.Scanner; /* Thư viện để lấy input từ User */
// import java.util.* 
/* Cụm "java.util" là tên của package. Còn dấu * nghĩa là lấy tất cả các class có trong package.
 * Ví dụ: Scanner, Stack, Queue, Arrays, Collections đều là class có trong package java.util.
 * Package là tập hợp nhiều file nằm chung thư mục. Mỗi file có thể chứa nhiều class nhưng dòng đầu tiên của những tệp này luôn là <package tên_package>.
 * Hiểu đơn giản, Package là 1 folder. Các file có chung package sẽ luôn bắt đầu bằng 1 dòng code, ví dụ: "package myDemo".
*/

public class Input2Number{
    public static void main(String[] args){
        System.out.print("Hello World!"); // output của "print" không xuống dòng. Thường được sử dụng để in một dãy số liên tiếp, ví dụ: 3 2 1 2
        System.out.println("Fuck1"); // mỗi output của "println" là 1 dòng mới.
        System.out.println("Fuck2");

        /*
         * Chú ý, nên khai báo Biến bên ngoài trước rồi hãy try{}catch(){}.
         * Bởi vì nếu khai báo Biến bên trong block của try{} hoặc block thuộc catch(){}, 
         * thì chúng nó sẽ bị lỗi không thể gọi đến ở block finally{} hoặc bên ngoài try{}catch(){}.
         */
        int x, y; // Ví dụ cho việc khai báo biến bên ngoài try{}catch(){}.
        try { // Chạy thử xem có lỗi gì không...
            Scanner myScan = new Scanner(System.in);
            
            System.out.println("Enter x: ");
            x = myScan.nextInt();
            System.out.println("Enter y: ");
            y = myScan.nextInt();
            
            myScan.close();
            System.out.println("=> x + y = " + (x+y));
        } catch (Exception e) { // Nếu có lỗi thì báo lỗi.
            System.out.println("Exception thrown:\n" + e); 
        } finally{
            System.out.println("Kệ Try-Catch bị lỗi hay không, đoạn code nằm trong block này vẫn chạy!");
        }
    }
}