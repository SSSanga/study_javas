public class Ifs {
        public static void main(String[] args) throws Exception { 
            //if (condition) {//
                // block of code to be executed if the condition is true
            //  } else{//
            //}
            // int A = 20;
            // int B = 18;
            // if (A > B) {
            //     System.out.println (A);
            // }
            // 12시 이전은 오전, 18시 이전은 오후, 24시까지는 밤.
            int time = 15;
            if (time < 12) {
                System.out.println ("오전 입니다.");
            }
            else if (time < 18) {
                System.out.println ("오후 입니다.");}
            else {System.out.println ("밤 입니다.");} 
            System.out.println("Hello World");
            // return 0;
        }
 }
