import java.util.Scanner;

public class HalfTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want in Triangle : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k = n-i-1;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}