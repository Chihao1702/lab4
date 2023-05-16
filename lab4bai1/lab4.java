
package lab4;
import java.time.LocalDate;        
public class lab4 {

    void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void xuat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void trungbinhthanhtiendat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class giaodich{
     String magiaodich;
     LocalDate ngaygiaodich;
     int Dongia;
     public giaodich(String magiaodich, LocalDate ngaygiaodich, int Dongia){
         this.magiaodich = magiaodich;
         this.ngaygiaodich = ngaygiaodich;
         this.Dongia = Dongia;
     }
     public giaodich(){
}
     public String getMagiaodich(){
         return magiaodich;
     }
     public void setMagiaodich(String magiaodich){
         this.magiaodich = magiaodich;
     }
     public LocalDate getNgaygiaodich(){
         return ngaygiaodich;
     }
     public void setNgaygiaodich(LocalDate Ngaygiaodich){
         this.ngaygiaodich = ngaygiaodich;
     }
     public int Dongia(){
         return Dongia;
     }
     public void setDongia(int Dongia){
         this.Dongia = Dongia;
     }
}
public class giaodichdat extends lab4{
    float dientichdat;
    String loaidat;

    public giaodichdat(float dientichdat, String loaidat) {
        this.dientichdat = dientichdat;
        this.loaidat = loaidat;
    }   
    public float getDientich(){
        return dientichdat;
    }
    public String getLoaidat(){
        return loaidat;
    }
    public void setLoaidat(String loaidat){
        this.loaidat = loaidat;
    }
}
public class giaodichnha extends lab4{
    String loainha;
    String diachi;
    float dientichnha;

    public giaodichnha(String loainha, String diachi, float dientichnha) {
        this.loainha = loainha;
        this.diachi = diachi;
        this.dientichnha = dientichnha;
    }
    public String getLoainha(){
        return loainha;
    }
    public void setLoainha(String loainha){
    this.loainha = loainha; 
}
    public String getdiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi = diachi;
    }
    public float getDientichnha(){
        return dientichnha;
    }
    public void setDientichnha(float dientichnha){
        this.dientichnha = dientichnha;
    }
}
}
    