import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        //  refer _ https://www.acmicpc.net/problem/10998
        // 문제 : A / B
        // 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        //
        Double A = 0d; Double B = 2d;
        A = myObj.nextDouble ();
        B = myObj.nextDouble ();

        System.out.print (A / B);

            // return 0 ;
    }
}
