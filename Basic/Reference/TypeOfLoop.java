public class TypeOfLoop{
    public static void main(String[] args){
        int myAge = 23, myNum = 2;
        
        String myName = "Hoang Thai";
        System.out.println("String myName length = " + myName.length());
        String[] myLaptop = {"Toshiba", "Acer", "Nitro"}; // Cách khai báo thứ 1.
        int[] numArray = new int[]{1, 2, 3, 4}; // Cách khai báo thứ 2.
        System.out.println("Array myLaptop length = " + myLaptop.length);
        System.out.println("Array numArray length = " + numArray.length);
        // Biến kiểu String sử dụng method length() để tính độ dài chuỗi.
        // Còn Array sẽ dùng method length để tính chiều dài mảng.
        // Điểm yếu của Mảng so với ArrayList là nó có độ dài cố định (phải khai báo), còn ArrayList thì không.

        if(myNum < 0){
            System.out.println("myNum < 0 is " + (myNum < 0));
        }else if(myNum < 10){
            System.out.println("myNum < 10 is " + (myNum < 10));
        }else{
            System.out.println("myNum > 0 && myNum > 10");
        }

        // if-else phiên bản thu gọn, chuyên dùng để gán giá trị.
        // Điểm yếu là phải gán biến rồi mới return, chứ không skip hẵng luôn được.
        String result = (myAge > 18) ? "I\'m older than 18" : "I\'m younger than 18";
        System.err.println(result);
        // Cái \' là ký tự đặc biệt, giúp viết được dấu nháy đơn.

        switch(myAge){
            case 10:
                System.out.println("You\'re 10 years old!");
                break;
            case 18:
                System.out.println("You\'re 18 years old!");
                break;
            default:
                System.out.println("I don\'t know how old are you...");
        }

        while(myNum < 5){
            System.out.println("While -> myNum = " + myNum);
            myNum++; // Bí quyết để dừng While là tạo Biến điều kiện ở ngoài block rồi mỗi lần chạy đúng thì ++ hoặc -- nó;
        }

        do{ // Do-While khác While ở chỗ block của Do sẽ chạy 1 lần bất kể điều kiện While có đúng hay sai.
            System.out.println("Do While -> myNum = " + myNum);
            myNum--;
        }while(myNum >= 2);

        for(int i = 0; i < 3; i++){
            System.err.print("-> \"for\" " + i + "\n");
        }

        // For each trong ngôn ngữ lập trình Java:
        for(String laptopName: myLaptop){
            System.out.println(laptopName);
        }
    }
}
