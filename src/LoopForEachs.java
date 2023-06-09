import java.util.ArrayList;

public class LoopForEachs {
    public static void main(String[] args) {
        // for (type variableName (for문에 사용할 변수 이름) : arrayName(변수이름(뭉쳐있음), ture일때 for문이
        // 도는데.. 쌓이는게 false이면 stop됨.) {
        // // code block to be executed
        // } < 원래 for문에 HashMap은 작동되지 않음.
        // 이렇데 사용하고 싶다면????key만 가져오던지, value만 가져오면..ㅠㅠ
        // 지금부터 String []말고 arrayList로 사용한다..
        try {
            ArrayList <String> cars = new ArrayList<String>(); // Generic?제너릭이라는 기능이 필요함. <>이 꺽쇠안에 datatype을 같이 선언해줘야함.
            cars.add("Volov"); // data type은 String, 순서대로 튀어나오게
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            // for (type(<-여기 data type) variableName(<-변수) : arrayName)
            for (String car : cars) {
            // for문 돌때 cars안에 0번 값이 나오는 것. 
                System.out.println(car);
            } // for_1:Volov, for_2:BMW, for_3:Ford, for_4:Mazda
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
