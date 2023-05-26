package cases;

import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            int price = 0;
            System.out.println("장바구니 5개까지 가능");
            System.out.println("===계산 시작===");
            // 1. 금액이 100을 초과하면 0원을 적용한다는 true와 break를 건다.
            
            System.out.print("1번 가격 :");
            price = myObj.nextInt();
            System.out.print("2번 가격 : ");
            price = myObj.nextInt();
            System.out.print("3번 가격 : ");
            price = myObj.nextInt();
            System.out.print("4번 가격 : ");
            price = myObj.nextInt();
            System.out.print("5번 가격 : ");
            price = myObj.nextInt();
            if (price > 100) {
                price = price * 0;
            }
            // System.out.println ("1번 가격 :");
            // price = myObj.nextInt();
            // System.out.println ("2번 가격 : ");
            // price = myObj.nextInt();
            // System.out.println ("3번 가격 : ");
            // price = myObj.nextInt();
            // System.out.println ("4번 가격 : ");
            // price = myObj.nextInt();
            // System.out.println ("5번 가격 : ");
            // price = myObj.nextInt();

            System.out.println("---담은 총합---");
            System.out.println("int 1번 + 2번+3번+4번+5번");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
        }
        ;
        System.out.println();
        System.out.println("---계산종료---");
        // return 0;
    }
}
