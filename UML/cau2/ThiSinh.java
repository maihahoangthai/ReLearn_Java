package UML.cau2;

public class ThiSinh{
    protected String MaSo;
    protected String HoTen;
    protected double diemMon1;
    protected double diemMon2;

    ThiSinh(){}

    ThiSinh(String MaSo, String HoTen, double diemMon1, double diemMon2){
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
    }

    public boolean xetKetQua(){
        double DiemTong = diemMon1 + diemMon2;
        if(DiemTong >= 15){
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