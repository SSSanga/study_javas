import java.util.ArrayList;

public class ClassArrayLists {
    public static void main(String[] args) {
        try {
            ArrayList arrayList = new ArrayList(); // 인스턴스화 instance
            // arraylist는 list임. 모양 자체가 순서대로 들어갈수 있게 됨.
            // list가 결국 array임.list라 쓴건 구분하기 위함??
            // 기존에 배운 array{,,,,}이 수만큼 들어감. 제한된 array size ex) Polls.java
            // arraylist는 size제한이 없음.
            arrayList.add(1);// true
            arrayList.add(2);// true
            arrayList.add(3);// true
            arrayList.size();//3
            arrayList.get(2); //value:3
            // int first =int arrayList.get(2); //
            arrayList.set(1,5);
            arrayList.remove(0); // (void)
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0 ;
    }
}
