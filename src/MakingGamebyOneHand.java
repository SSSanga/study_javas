public class MakingGamebyOneHand {
    public static void main(String[] args) {
        String A = "";
        String B = "";
        String C = "";
        A = "1";
        B = "";
        C = "2";
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        A = A;
        B = C;
        C = ""; 
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);

        B = B;
        C = A;
        A = ""; 
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);
        A = B;
        C = C;
        B = ""; 
        System.out.println (A);
        System.out.println (B);
        System.out.println (C);           
       //return 0;
    }
}
