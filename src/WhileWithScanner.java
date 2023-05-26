public class WhileWithScanner {
    public static void main(String[] args) {
        // try catch문 사용
        try {
            // break문에 대한 사용해보기
             //보통 문장 끝나면 tab으로 간격 벌리고 주석 씀. 
            for (int first = 0; first < 4 ; first = first + 1){
                if (first == 2 ){  //first 값이 2면 for문 종료 
                    break;
                }
                System.out.println ();
            }
            // break와 상응하는 key = continue
        } catch (Exception e) {
            System.out.println ();
        } finally {
            System.out.println ();
        }
        
        System.out.println ();
        // return 0;
        // print는 화면에 표시하라고 할때만...
    }
}
