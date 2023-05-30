public class MethodsSwitchs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String today(int day) {
        String str = "";
        try {

            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Tuesday";
                    break;
                case 3:
                    str = "Wednesday";
                    break;
                case 4:
                    str = "Thursday";
                    break;
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;

    }

    public static void main(String[] args) {
        try {
            int day = 4; // 1~4까지만
            String str = "";

            MethodsSwitchs methodsSwitchs = new MethodsSwitchs();
            String returnResult = methodsSwitchs.today(day);
            System.out.println(returnResult);
        }

        // function 문장이 반복되는것보단 정리하자.!
        // ex System.out.println //Thursday 부분는 변수로 활용

        catch (Exception e) {
            // TODO: handle exception
        }
        // return 0 ;
    }
}
