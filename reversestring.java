import java.util.Scanner;

//Program to reverse a given string 

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string which you want to reverse - ");
        String st = sc.nextLine();
        String reversedString="";
        for(int i=st.length()-1;i>=0;i--){
            reversedString=reversedString+st.charAt(i);
        }
        System.out.println("String after reversal is - "+reversedString);
    }

}
