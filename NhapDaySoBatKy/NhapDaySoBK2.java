// javac NhapDaySoBK2.java
// java NhapDaySoBK2
import java.util.Scanner;
import java.util.Arrays;

public class NhapDaySoBK2{
    public static void main(String[] args){
        // B1: Take user Input
        Scanner myScan = new Scanner(System.in);
        System.out.println("Vui long nhap vao mot day so. Vi du:");
		System.out.println("1 2 3 4 5");
		System.out.println("Day so cua ban la:");
        String input = myScan.nextLine();
        myScan.close();

        // B2: String Input -> String[] array1
        String[] array1 = input.trim().split("\\s+");

        // B3: Tinh sum cua day so
        double sum = 0;
		for(String element: array1){
			try{
				System.err.println(element);
				sum += Double.parseDouble(element);
			}catch(Exception e){
				System.out.println("Exception thrown: " + e);
                // If can't convert, do nothing and skip to next element.
			}
		}
        System.out.println("input.length() = " + input.length());
		System.out.println("array1.length = " + array1.length);
        System.out.println("String array1[0] = " + array1[0]);
        System.out.println("String array1: " + Arrays.toString(array1));
        System.out.println("-> Tong day so = " + sum);

		
        System.out.println("======");
        // Cach Convert String Array -> int Array:
        // B1: Tao mot int Array moi & IndexPosition
        int[] array2 = new int[array1.length];
        int indexPosition = 0;
        // B2: Dung vong lap for de gan int Array[IndexPosition] = String Array[j]
        for(int j = 0; j<array1.length; j++){
            try{
                array2[indexPosition] = Integer.parseInt(array1[j]);
                indexPosition++;
            }catch(Exception e){
                // Do nothing. Skip this array1[j] if an Error occur.
				// No change to indexPosition value.
            }
        }
        // B3: Su dung Arrays.copyOf(); de cat may phan vo van khoi int Array. 
        // Vi du: "Hellu 3 Fuck 1 2 1" -> 3 1 2 1
        array2 = Arrays.copyOf(array2, indexPosition);
        System.out.println("int[] array2 = " + Arrays.toString(array2));
        System.err.println("array2.length = " + array2.length);
    }
}