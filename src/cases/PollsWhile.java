package cases;

import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner (System.in);
            String info = ("");
            System.out.print ("Exit:종료 "+"Poll:설문 시작 "+"Statistic:설문 통계 ");
            info = myObj.nextLine();
            
            boolean reply = true ;
           while (reply) {
            
            if (info.equals ("P")){ 
            
                System.out.println ("설문을 시작합니다.");

            } else if (info.equals ("S")){
                System.out.println ("설문 통계를 시작합니다. ");

            } else if (info.equals ("E")){
                System.out.println ("설문을 종료합니다.");
                break;
                }
                else {System.out.println ("설문이 에러났습니다.");
            break;}
                
            }


            
            
        } catch (Exception e) {
            System.out.println ();
        }

        finally {System.out.println ();}
        System.out.println ();
        // return 0;
    }
}
