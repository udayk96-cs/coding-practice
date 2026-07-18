import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series - ");
        int n= scanner.nextInt();
        int n0 =0, n1=1;
        for(int i = 0;i<n;i++){
            System.out.print(n0 + " ");
            int n2 = n1 + n0;
            n0=n1;
            n1=n2;
        }
    }
}

