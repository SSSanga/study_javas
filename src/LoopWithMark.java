public class LoopWithMark {
    public static void main(String[] args) {
        // for문만 사용. "_?"를 5번까지 찍어보기. 
        
        int mark = 5;

        for (int number = 1; number < mark; number = number + 1) {
            System.out.println ("for " + number);
        }
        System.out.println ("END");
        // return 0;

    }
}
