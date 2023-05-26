package cases;

import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("장바구니 5개까지 가능");
            System.out.println("===계산 시작===");
            // 1.각 품목마다 가격의 금액를 입력하도록 하자. nextInt_OK
            // 2.입력 가격이 100 초과가 되면 0이 되도록 하자. *를 쓰겠다.
            // --->이렇게 하려면 if 조건문이 필요하다.
            // ----->if 조건문에 넣을 pay_a~e를 넣을 그룹이 있어야한다.ㅠㅠ _우연치않게 넣음.
            // -----> 숫자가 100이 초과되면 0이 되고 총합에 더하게 하자._OK
            // 3. 여기서 문제는 price에 들어갈때 100이 초과하는 부분이 정해져있음. 이를 부여해야함.
            // ----->이때 이걸 for문으로 묶어야함.........

            // System.out.print("1번 가격 :");
            // price[0] = myObj.nextInt();
            // System.out.print("2번 가격 : ");
            // price[1] = myObj.nextInt();
            // System.out.print("3번 가격 : ");
            // price[2] = myObj.nextInt();
            // System.out.print("4번 가격 : ");
            // price[3] = myObj.nextInt();
            // System.out.print("5번 가격 : ");
            // price[4] = myObj.nextInt();

            int[] price = {0,0,0,0,0};
            for (int listnumber = 0; listnumber < price.length ; listnumber = listnumber + 1) {

                System.out.print("1번 가격 :");price[listnumber] = myObj.nextInt();
                System.out.print("2번 가격 : ");price[listnumber] = myObj.nextInt();
                System.out.print("3번 가격 : ");price[listnumber] = myObj.nextInt();
                System.out.print("4번 가격 : ");price[listnumber] = myObj.nextInt();
                System.out.print("5번 가격 : ");price[listnumber] = myObj.nextInt();
                if (price[listnumber] > 100) {
                    price[listnumber] = price[listnumber] * 0;
                }
            }

            System.out.println("---담은 총합---");
            System.out.println(price[0] + price[1] + price[2] + price[3] + price[4]);

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
