// <access_modifier> <return_type> <method_name>( list_of_parameters)
// {
// //body
// }
//각각의 곱셈, 나눗셈, 덧셈, 뺄셈에 대한 class?를 정의하고 이를 입력받아 결과 낼것. 
import java.util.Scanner ; 
public class MethodMaxMin {
    public double Multiple(int firstnum, int secondnum) {
        double calculation = 0;
        try {
            calculation = firstnum * secondnum;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return calculation;
    }

    public double Divide(int firstnum, int secondnum) {
        double calculation = 0;
        try {
            calculation = firstnum / secondnum;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return calculation;
    }

    public double Plus(int firstnum, int secondnum) {
        double calculation = 0;
        try {
            calculation = firstnum + secondnum;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return calculation;
    }

    public double Subtract(int firtstnum, int secondnum) {
        double calculation = 0;
        try {
            calculation = firtstnum - secondnum;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return calculation;
    }
    //각각의 Multiple, Divide, Plus, Subtract라는 Method?function을 만들었다. 

    public static void main(String[] args) {
        try {
            Scanner numbers = new Scanner (System.in);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0 ;
        System.out.println();
    }
}
