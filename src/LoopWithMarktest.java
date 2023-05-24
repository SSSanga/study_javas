public class LoopWithMarktest {
    public static void main(String[] args) {
        // for문만 사용. "_?"를 5번까지 찍어보기. 
        int number = 5;
        String mark = "";
        for (int count = 1; count < number; count = count + 1){
            for (mark = "_?";count <number; mark = mark + mark){
                System.out.println (mark);}}
       
        
        
        System.out.println ("END");
        // return 0;

    }
}
