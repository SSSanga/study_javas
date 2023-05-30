import javax.naming.spi.DirStateFactory.Result;

public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int minus(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
        
        // return은 맨 나중에.
    }

    public static void main(String[] args) {
        try {
            // 인스턴스 1회
            // 초기 값은 < 2
            // main 결과값 = 17
            int first = 1;
            int second = 1;

            Methods plus = new Methods();
            first = plus.add(first, second);
            first = first + 5 ; 
            first = plus.add(first, second);
            first = first + 4 ; 
            first = plus.add(first, second);
            first = first + 3 ; 
            first = plus.add(first, second);
            first = first + 2 ; 
            first= plus.add(first, second);
            first = plus.minus(first,second);
            first = plus.minus(first,second);
            first = plus.minus(first,second);


        



        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        
        // return 0 ;

    }
}
