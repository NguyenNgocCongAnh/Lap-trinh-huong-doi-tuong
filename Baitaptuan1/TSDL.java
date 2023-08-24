//Bai a)Nhập vào một dãy số từ tham số dòng lệnh và sắp xếp dãy số
public class TSDL{ 
    public static void main(String[] args){
        int[] a = new int[args.length];//tao mang a co do dai bang phan tu co trong mang args
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);//chuyển chuỗi thành số nguyên
        }
        int temp,t,i;
        for(i=0;i<args.length;i++){
            //tim va doi cho cac so de sap xep thanh day tang dan
            for(t=0;t<args.length;t++){
                if(a[i]<a[t]){
                temp=a[i];
                a[i]=a[t];
                a[t]=temp;  
        }
      }
    }
        for(i=0;i<args.length;i++){
            System.out.print(a[i]+" ");
    }
  }
}