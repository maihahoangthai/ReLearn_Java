public class method1{
    public static void main(String[] args){
        myMethod();
        myMethod(2);
        int howOldAreYou = myAge(23);
        myAge(6);
    }

    // Các Method có thể có trùng tên nhưng phải khác Parameter!
    // Khai báo Method trước hay sau hàm main đều được, miễn nằm chung block trong Class.
    static void myMethod(){
        System.out.println("I\\'m not okay."); // Có ký tự đặc biệt.
    }
    static void myMethod(int numOfPrint){
        for(int i = 0; i<numOfPrint; i++){
            System.out.println("It\'s alright...."); // Có ký tự đặc biệt.
        }
    }

    // "void" nghĩa là không "return" gì cả.
    /* Còn nếu thay "void" bằng một Data Type bất kỳ,
    thì phải có thêm "return" data type đó. */
    static int myAge(int age){
        String result = (age>18) ? "Access granted!" : "Access denied!";
        System.out.println(result);
        return age;
    }

    /* "static" nghĩa là có sẵn, gọi khi nào cũng được.
     * "public" nghĩa là gắn liền với object, phải new object thì mới gọi được.
     */
}