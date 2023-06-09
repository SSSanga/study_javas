public class Arrays {
    public String[] initialArray() {
        String[] carTypes = { "Volvo", "BMW", "Ford", "Mazda","KIA" };
        // 초기화
        return carTypes;
        // cars의 array를 return한다.
        // return타입은 결국 string의 array이므로 String[]로 한다.

    }

    public static void main(String[] args) {
        // String [][] numbers = {{"10", "20", "30", "40"} ,
        // {"50", "60", "70"}};
        // for (int second = 0; second < numbers.length;second = second +1){
        // for (int third = 0; third < numbers[second].length;third=third +1){
        // System.out.print (numbers[second][third]+ ", ");
        // }
        // System.out.println();

        // }
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println (cars);
        // }
        Arrays arrays = new Arrays(); // 여긴 classname이 들어가야지.

        String[] cars = arrays.initialArray();
        System.out.println(cars.length);

        for (int first = 0; first < cars.length; first = first + 1) {
            System.out.print(cars[first] + ",");
        }

        // System.out.println ();

        // for문으로 array값 출력하기.
        // for (int name = 0; name < 4 ; name = name + 1) {
        // System.out.print (cars [name] +" " );

        // return 0 ;
        
        // 5월31일 array를 이용
        // main에 상단에 array값을 setting 한 뒤 그를 이용하여 진행하면 됨.
        // 1.cars 만 값을 부여해서 return 할 수 있게 한다. (class만들지 않고 function으로 진행. )
        //Scanner를 받고나서 return 전에 close를 해야함. 
    }
}