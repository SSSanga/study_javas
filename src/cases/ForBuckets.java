package cases;
import java.util.Scanner;
public class ForBuckets {
    public static void main(String[] args) {
        try {
            //장바구니 품목 3가지만 담기 선언
            String bucket_a="";
            String bucket_b="";
            String bucket_c="";
            Scanner myObj = new Scanner (System.in);
            System.out.print ("1번 담기 : ");
            bucket_a = myObj.nextLine();
            System.out.print ("2번 담기 : ");
            bucket_b = myObj.nextLine();
            System.out.print ("3번 담기 : ");
            bucket_c = myObj.nextLine();

            System.out.println ("---장바구니 품목 list---");
            System.out.print(bucket_a + ",");
            System.out.print(bucket_b +",");
            System.out.print(bucket_c);
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {};
        System.out.println();
        // return 0;
        
    }
}
