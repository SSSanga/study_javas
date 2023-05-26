package cases;

import java.util.Scanner;

public class ForBuckets {
    public static void main(String[] args) {
        try {
            // 1. System.out.print ("1번 담기 : ")이부위가 다름. 1번담기, 2번 담기, 3번 담기
            // ->이걸 1,2,3을 array를 이용하면 될것같은데!!!!!!!...
            // ->array고 0,1,2..늘어나는것을 +1로 for문을 돌린다.

            String bucket_a = "";
            String bucket_b = "";
            String bucket_c = "";
            String[]bucket = { "", "", "" }; // 묶음중에 array []

            Scanner myObj = new Scanner(System.in);
            // for문에 줄 수 있는 값은 한개.
            // ->0으로 시작할지 1로 시작할지는 data 숫자 시작점으로 시작한다.
            for (int first = 0; first < bucket.length; first = first + 1) {
                System.out.print((first + 1) + "번 담기 : ");
                //1번담기라는 1를 대체할 수 있는것을찾아랏.=first
                //먼저 계산하고자 하는 것을 ()로 묶어버린다. 
                bucket[first]= myObj.nextLine();
            }
            //error가 나는 경우 1) 문법에러 2)realtime에러 : outofindex

            System.out.println("---장바구니 품목 list---");
            System.out.print(bucket[0] + ", ");
            System.out.print(bucket[1]+ ", ");
            System.out.print(bucket[2]);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
        }
        ;
        System.out.println();
        // return 0;

    }
}
