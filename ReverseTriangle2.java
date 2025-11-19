import java.util.Scanner;

public class ReverseTriangle2 {
    public static void main(String[] args) {
        System.out.print("Enter the number you want row in triangle : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = n-i;j<n;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}