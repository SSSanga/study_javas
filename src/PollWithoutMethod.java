import java.util.Scanner;
public class PollWithoutMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String answer = ""; 
        String [] answers = {"" , ""};
        // <answer들 넣을 수 있게 array를 만들어줌. 

        // nextLine이 Scanner에서 글자 입력하는 값. 
        System.out.println ("1.문항");
        System.out.println ("(1)"+"(2)"+"(3)"+"(4)");
        System.out.print ("답을 고르시오.");
        answers[0] = myObj.nextLine (); 

        System.out.println ("2.문항");
        System.out.println ("(1)"+"(2)"+"(3)"+"(4)");
        answers[1] = myObj.nextLine (); 
            for (int first = 0; first < answers.length; first = first +1) {

            }
        System.out.println ();
        // return 0 ;
        // 반복되는 구문을 찾았다면..!!!ex) 
    }
}
