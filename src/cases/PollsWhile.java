package cases;

import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner (System.in);
            String info = ("");
            System.out.print ("(E)xit:종료 "+"(P)oll:설문 시작 "+"(S)tatistics:설문 통계 ");
            info = myObj.nextLine();
            
            boolean reply = true ;
           while (reply) {
            
            if (info.equals ("P")||info.equals ("Poll")){ 
            
                System.out.println ("설문을 시작합니다.");
                info = myObj.nextLine();

            } else if (info.equals ("S")||info.equals ("Statistics")){
                System.out.println ("설문 통계를 시작합니다. ");
                info = myObj.nextLine();

            } else if (info.equals ("E")||info.equals ("Exit")){
                System.out.println ("설문을 종료합니다.");
                break;
                }
                else {System.out.println ("설문이 에러났습니다.");
                info = myObj.nextLine();}
                
            }


            
            
        } catch (Exception e) {
            System.out.println ();
        }

        finally {System.out.println ();}
        System.out.println ("END");
        // return 0;
    }
}
