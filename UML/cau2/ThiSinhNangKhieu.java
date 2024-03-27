package UML.cau2;

public class ThiSinhNangKhieu extends ThiSinh{
    private double diemMonNangKhieu;

    public boolean xetKetQua(){
        double DiemTong = diemMon1 + diemMon2 + diemMonNangKhieu;
        if(DiemTong >= 25){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "(" + this.MaSo + ", " + this.HoTen + ", " + xetKetQua() + ")";
    }
}