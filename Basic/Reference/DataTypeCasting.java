public class DataTypeCasting{
    /* Convert giá trị của biến kiểu dữ liệu Primitive
     * sang một kiểu dữ liệu Primitive khác.
    */
    public static void main(String[] args){
        // Trường hợp 1, từ kiểu Nhỏ -> Lớn: 
        // Chỉ đơn giản là gán giá trị của thằng nhỏ cho thằng lớn.
        int myByte1 = 10;
        double myDouble1 = myByte1;
        System.out.println("int myByte = " + myByte1);
        System.out.println("-> double myDouble: " + myDouble1);

        // Trường hợp 2, từ kiểu Lớn -> Nhỏ: 
        // Phải có thêm (kiểu dữ liệu muốn chuyển đổi) nữa.
        float myFloat2 = 5.6f;
        byte myByte2 = (byte) Math.round(myFloat2);
        System.out.println("float myFloat2 = " + myFloat2);
        System.out.println("-> byte myByte2: " + myByte2);
    }
}
