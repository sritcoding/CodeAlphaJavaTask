import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        int i,j,k;
        for(i=97;i<=122;i++){
            System.out.println((char)i);
        }
        for(j=65;j<=90;j++){
            System.out.println((char)j);
        }
        for(k=48;k<=57;k++){
            System.out.println((char)k);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
    }
    
}
