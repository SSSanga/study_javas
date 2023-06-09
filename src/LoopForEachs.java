import java.util.ArrayList;
import java.util.HashMap;

public class LoopForEachs {
    public static void main(String[] args) {
        // for (type variableName (for문에 사용할 변수 이름) : arrayName(변수이름(뭉쳐있음), ture일때 for문이
        // 도는데.. 쌓이는게 false이면 stop됨.) {
        // // code block to be executed
        // } < 원래 for문에 HashMap은 작동되지 않음.
        // 이렇데 사용하고 싶다면????key만 가져오던지, value만 가져오면..ㅠㅠ
        // 지금부터 String []말고 arrayList로 사용한다..
        try {
            ArrayList<String> cars = new ArrayList<String>(); // Generic?제너릭이라는 기능이 필요함.
            // <>이 꺽쇠안에 datatype을 같이 선언해줘야함.
            cars.add("Volov"); // data type은 String, 순서대로 튀어나오게
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            // for (type(<-여기 data type) variableName(<-변수) : arrayName)
            for (String car : cars) {
            // for문 돌때 cars안에 0번 값이 나오는 것.
            System.out.println(car);
            } // for_1:Volov, for_2:BMW, for_3:Ford, for_4:Mazda

            // HashMap 하기
            // Automobile Company Vehicle Names
            // |CarCompany | CarName | Year | CarCharateristics |
            // | Hyundai | Grandeur | 2019 | Sedan, Gasoline, Rear-wheel drive |
            // | Kia | Soul | 2020 | Electric car, 5 seats, 1-hour charging time |
            // | Chevrolet | Cruze | 2018 | Sedan, Diesel, Rear-wheel drive |
            ArrayList<HashMap> carList = new ArrayList<HashMap>(); // 여기에 hashMap 넣어줄거야.
            HashMap<String, String> carSpec = new HashMap<String, String>(); // 여기엔 key values 넣을거야.
            // 이때 key도 String, values도 String.그래서 <String, String> 만약 value가 int면 <String,
            // int>
            // 위의 표에서 carcompany가 key 현대는 values->이렇게 넣으면 레코드 한줄이 생길거 => 그렇다고 레코드처럼 한묶음으로
            // 움직이는건 아님. ..?롸?
            // 이렇게 생긴 hashMap을 arrayList에 넣어준다....이걸 반복하면 table 이 만들어짐.....
            carSpec.put("CarCompany", "Hyundai");
            carSpec.put("CarName", "Grandeur");
            carSpec.put("Year", "2019"); // CarCharacteristics 제외하도록함.

            carList.add(carSpec); // 현대 정보 넣음

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Kia");
            carSpec.put("CarName", "Soul");
            carSpec.put("Year", "2020");

            carList.add(carSpec); // 기아 정보 넣음

            carSpec = new HashMap<String, String>();
            carSpec.put("CarCompany", "Chevrolet");
            carSpec.put("CarName", "Cruze");
            carSpec.put("Year", "2018");

            carList.add(carSpec); // 쉐보레 정보 넣음.

            // 이런식 (HashMap new가 없는상태)으로 넣어버리면 같은 줄에서 데이터가 덮어써짐. 새로 만들어줘서 해야함
            // carSpec = new를 해주어야함. 그래야 다음 줄로 넘어감. 고로 hashMap에 put할때마다 new도 입력해줘야함.
            // for (type variableName (변수): arrayName(array or arrayList)) {}
            for (HashMap<String, String> car : carList) {
                System.out.println(
                        car.get("CarCompany") + "/" + car.get("CarName") + "/" + car.get("Year"));
            }
            // results
            // Hyundai/Grandeur/2019
            // Kia/Soul/2020
            // Chevrolet/Cruze/2018

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
