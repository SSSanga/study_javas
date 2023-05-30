public class Methodsifs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String mornafternight(int time) {
        String rightnow = "";
        try {
            // if (time < 12) {
            // System.out.println("오전입니다.");
            // } else if (time < 18) {
            // System.out.println("오후입니다.");
            // } else {
            // System.out.println("밤입니다.");
            // }
            if (time < 12) {
                rightnow = "오전입니다.";
            } else if (time < 18) {
                rightnow = "오후입니다.";
            } else {
                rightnow = "밤입니다.";
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rightnow;
    }

    public static void main(String[] args) {
        try {
            int time = 21; // tome < 12 오전, <18 오후, 나머지 밤
            Methodsifs timeis = new Methodsifs();
            String rightnowis = timeis.mornafternight(time);
            System.out.print (rightnowis);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0 ;
    }
}
