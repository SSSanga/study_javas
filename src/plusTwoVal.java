import java.util.Scanner ;
public class plusTwoVal {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);

        int apple = 0;
        int banana = 0;

        apple = myObj.nextInt() ;
        banana = myObj.nextInt() ;

        System.out.println (apple + banana);
        
        // return 0;
    }
}
