public class JavaHowTo{
    public static void main(String[] args) {
        // Reverse a String:
        String input1 = "Hello Thai";
        String reverseSTR = "";
        for(int i=0; i < input1.length(); i++){
            reverseSTR = input1.charAt(i) + reverseSTR;
        }
        System.out.println("String goc la: " + input1);
        System.out.println("-> String nghich dao la: " + reverseSTR);

        // Count Number of Words in a String
        String input2 = "Mot hai ba bon nam";
        int count = (input2.split("\\s")).length;
        System.out.println("Chuoi String goc la: " + input2);
        System.out.println("-> Tong so tu trong chuoi String noi tren la: " + count);
    }
}