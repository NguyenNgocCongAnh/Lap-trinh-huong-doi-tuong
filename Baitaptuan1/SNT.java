//Bai c)Viết chương trình nhập vào một số, kiểm tra số đó có là số nguyên tố hay không. Liệt kê các số nguyên tố nhỏ hơn 10000
import java.util.Scanner;
public class SNT{
    static void checkVar(int x){
        int count = 0;
        for (int i = 2; i<= Math.sqrt(x);i++)
            if(x%i==0)
                count++;
        if (count==0)
            System.out.print(x+" IT IS PRIME");
        else
            System.out.println(x+" IT IS NOT PRIME");

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        
        int x = sc.nextInt();
        checkVar(x);
        //in so nguyen to nho hon 10000
        for (int i=0 ;i<=10000;i++){
            int dem=0;
            for(int t=2;t<=Math.sqrt(i);t++){
                if(i%t==0)
                    dem++;
            }
        if(dem==0)
            System.out.println(i);
        }
    }
}