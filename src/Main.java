import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        //  refer _ https://www.acmicpc.net/problem/10998
        // 문제 : A x B
        // 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        
        int A = 0; int B = 0;
        A = myObj.nextInt ();
        B = myObj.nextInt ();

        System.out.print (A * B);

            // return 0 ;
    }
}
