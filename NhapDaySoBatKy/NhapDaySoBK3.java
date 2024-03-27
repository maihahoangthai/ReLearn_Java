/* Câu 1 đợt tháng 11 năm 2023:
 * Nhập vào một số nguyên N, với N phải >=0 và <=1000. 
 * Tiếp đó, nhập vào một dãy số. 
 * Nếu dãy số đối xứng thì in 1, nếu không đối xứng thì in 0.
 * Ví dụ: 6 3 2 1 1 2 3 -> 1
 */

/* Câu 3a đợt tháng 11 năm 2023:
 * Sắp xếp dãy số theo thứ tự tăng dần hoặc giảm dần rồi in ra màn hình. 
 * Ví dụ: 4 2 6 3 1 -> 4 1 2 3 6
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;
// javac NhapDaySoBK3.java
// java NhapDaySoBK3
public class NhapDaySoBK3{
    public static void main(String[] args) {
        // Convert Input -> String[]
        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();
        myScan.close();
        String[] array1 = input.trim().split("\\s+");
        System.out.println("String[] array1: " + Arrays.toString(array1));
        
        // Convert String[] -> int[]
        int[] array2 = new int[array1.length];
        int IndexPosition = 0;
        for(int i=0; i<array1.length; i++){
            try{
                array2[IndexPosition] = Integer.parseInt(array1[i]);
                IndexPosition++;
            }catch(Exception e){
                // Skip if can't convert.
            }
        }
        array2 = Arrays.copyOf(array2, IndexPosition);
        System.out.println("int[] array2: " + Arrays.toString(array2));

        // Trich xuat N
        int N = array2[0]; // Chu y, N == length cua day so.
        System.out.println("N = " + N);
        int[] array3 = Arrays.copyOfRange(array2, 1, array2.length);
		System.out.println("int[] array3: " + Arrays.toString(array3));
        
        // Check N>=0 và N<=1000
        int result = NhapDaySo(N, array3);
        System.out.println("--> Result = " + result);

        // Sap xep day so tang dan hoac giam dan
        int[] arrayTangDan = SapXepTangDan(array2);
		System.out.println("int[] arrayTangDan: " + Arrays.toString(arrayTangDan));
		int[] arrayGiamDan = SapXepGiamDan(array2);
		System.out.println("int[] arrayGiamDan: " + Arrays.toString(arrayGiamDan));
    }

    static int NhapDaySo(int N, int[] array3){
        // Check 0 <= N <=1000
        if((N<0) || (N>1000)){
            System.out.println("Incorrect, because your N<0 or N>1000");
            return 0;
        }else if(N==0 || N==1){
            // N == 0 vô nghĩa, không thể so sánh đối xứng.
            // "Dãy số", tức là phải có nhiều hơn 2 số. Nên N == 1 là sai! 
            System.out.println("Incorrect, because your N == " + N);
            return 0;
        }else{
            // Tinh vi tri de chia mang Array3 thanh 2 phan
            int pos = Math.round(N / 2);
            System.out.println("Split position = " + pos);
            // Tach thanh ArrayTrai & ArrayPhai
            int[] arrayTrai = Arrays.copyOfRange(array3, 0, pos);
            int[] arrayPhai = Arrays.copyOfRange(array3, pos, array3.length); // N = array3.length;
            System.out.println("int[] arrayTrai: " + Arrays.toString(arrayTrai));
            System.out.println("int[] arrayPhai: " + Arrays.toString(arrayPhai));

            // Check ArrayTrai == ArrayPhai, Neu sai -> 0. Neu dung -> 1.
            int reverse = arrayPhai.length - 1;
            for(int i=0; i<arrayTrai.length; i++){
                if(arrayTrai[i] != arrayPhai[reverse]){
                    System.out.println("Sai! -> " + arrayTrai[i] + " != " + arrayPhai[reverse]);
                    return 0;
                }else{
                    reverse--;
                }
            }
            return 1;
        }
    }

    // Sap xep day so tang dan
    static int[] SapXepTangDan(int[] array2){
        // Không thao tác trên array2 đầu vào. Cũng như return array2;
        // Là bởi làm vậy khiến ảnh hưởng tới method SapXepGiamDan() và ngược lại.
		int[] arrayTangDan = Arrays.copyOf(array2, array2.length);
		Arrays.sort(arrayTangDan, 1, arrayTangDan.length);
		return arrayTangDan;
	}

    // Sap xep day so giam dan
    static int[] SapXepGiamDan(int[] array2){
		Integer arrayGiamDan1[] = new Integer[array2.length];
		for(int i=0; i<array2.length; i++){
			arrayGiamDan1[i] = array2[i];
		}
		Arrays.sort(arrayGiamDan1, 1, arrayGiamDan1.length, Collections.reverseOrder());
        // Sự kết hợp Arrays.sort + Collections.reverseOrder() yêu cầu
        // phải Integer[] mới sử dụng được.
		
		int[] arrayGiamDan2 = new int[array2.length];
		for(int i=0; i<array2.length; i++){
			arrayGiamDan2[i] = arrayGiamDan1[i];
		}
		return arrayGiamDan2;
	}

}