import java.util.Scanner;

public class Breaks {
    public static void main(String[] args) {
        // 업무: 묻고 답하는 내용이 반복. > for 혹은 while을 생각할 것.
        // break point는 만약 횟수가 있다면 for문(몇번 물어보고 종결이 난다면 )
        // 만약 횟수가 없다면 while문 이용 (끝이 나지 않는다면).
        // 분기는 if문
        // 콜센터 업무 안내 작성
        try {
            Scanner myObj = new Scanner(System.in);  
            // Create a Scanner object //Scanner의 변수는 최대한 밖에 .. 
            String answer = "";
            
            System.out.println ("안내입니다.");
            System.out.println ("1.대출"+"2.예금"+"3~9.종료");
            //while이 true면 계속 while문이 돌기때문에 condition을 
            boolean loops = true; 
            //boolean은 true아니면 false 만 존재하며 자연수로만 ??인식????
            while (loops) {
                        //분기는 3번 돈다. if, else if, else
                        System.out.print ("입력하세요");
                        answer = myObj.nextLine ();
                        if (answer.equals("1") ) {
                        System.out.println ("대출 업무 입니다.");
                        } else if (answer .equals("2") ) {
                        System.out.println ("예금 업무 입니다.");
                        } else {
                        System.out.println ("안내 종료 입니다.");
                        break;
                        }
            }
            
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        //java에서는 String글자를 ==로 사용하기가 힘듦. 
        //고로 변수.equals 를 써줘야함. 
        //if문으로 분기를 지나고 다시 안내. 


        System.out.println();
        // return 0;
        // print는 화면에 표시하라고 할때만...
    }
}
