import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();                   //type the rows you want in square
        int c = sc.nextInt();                   //type the columns you want in square

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}