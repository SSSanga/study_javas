import cases.ClassSeconds;

public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classfirsts = new ClassFirsts(); // no parameter
            ClassFirsts classfirstsWithVar = new ClassFirsts(5); // first
            int second = classfirstsWithVar.getSecond();
            ClassSeconds classseconds = new ClassSeconds(6);
            // 이게 Scanner와 유사함.
            // java.util.Scanner = java의 util의 Scanner였음.
            // 결국 Scanner가 있는 파일 위치를 얘기한것.
            // package에 생성된 class를 사용하려면 import를 넣어준 뒤 사용한다. 
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0 ;
    }
}
