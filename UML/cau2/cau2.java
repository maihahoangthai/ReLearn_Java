package UML.cau2;

public class cau2 {
    public static void main(String[] args) {
        // ThiSinh object:
        ThiSinh sv1 = new ThiSinh("SV01", "Nguyen Van A", 5.25, 2.75);
        System.out.println(sv1);
        ThiSinh sv2 = new ThiSinh("SV02", "Nguyen Van B", 8, 9);
        System.out.println(sv2);

        // ThiSinhNangKhieu object:
        ThiSinhNangKhieu sv3 = new ThiSinhNangKhieu("SV03", "Ly Van C", 5.25, 2.75);
        System.out.println(sv3);
    }
}
