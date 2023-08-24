//Bai b)Nhập vào một năm và cho biết năm đó là năm nhuận hay không phải là năm nhuận
import java.util.Scanner;

public class namnhuan {
    //kiem tra nam nhuan bang cach nam do phai chia het cho 4 va khong chia het cho 100
    static void checknam(long x){
        if(x%100!=0 && x%4==0 ){
            System.out.println("Nam hien tai la nam nhuan ");
        }
        else{
            System.out.println("Nam hien tai khong phai nam nhuan ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);// thu vien nhap lieu
        System.out.println("Moi ban nhap nam ");
        
        long x = sc.nextLong();//nhap so nam
        checknam(x);
    }
}
