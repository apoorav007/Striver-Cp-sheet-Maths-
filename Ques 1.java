import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

           // bcoz in triangle sum of two side is always greater than or equal to 3rd side 
            // since order of a b c d is in increasing order so we can a b b or b c c;
                System.out.println(b + " " + c + " " +c);
            
        }

    }
}

