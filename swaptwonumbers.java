public class swaptwonumbers {

    public static void main(String[] args) {
        int a=15;
        int b=87;
        int c = a + b;
        a=c-a;
        b=c-a;
        System.out.println("Value of a after swapping is "+a);
        System.out.println("Value of b after swapping is "+b);
    }

}
