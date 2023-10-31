import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starts here:");
        int start = input.nextInt();
        System.out.print("Enter the ends here:");
        int end = input.nextInt();
        if (start > end){
            System.out.print("False");
        }
        else{
            int a = start;
            int b = start + 1;
            int c = 0;
            while(b <= end){
                c = a + b;
                a = c;
                b = b+1;
            }
            System.out.println("%d", c);
        }
    }
}