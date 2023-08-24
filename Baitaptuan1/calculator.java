//Bai d) Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nhập vào từ bàn phím

import java.util.Scanner;
public class calculator{
    static int tinh(int a, int b){
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
    static int calcul(int a, int b){
        return a*b/tinh(a,b);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao hai so de tim UCLN va BCNN: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("UCLN la "+ tinh(x,y));
        System.out.println("BCNN la "+ calcul(x,y));
    }
}