public class MethodBasic {
    // function은 function과 동급으로 설정해줘야함.
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x + 1
    // 강사님 버전...!!!!!!!!!!!!!!!!!
            public class MethodBasics {
                // <access_modifier> <return_type> <method_name>( list_of_parameters)
                // {
                // //body
                // }
                // x에 +1
                public int F(int x) // x = 0
                {
                    int result = x + 1;
                    return result;
                }
                public static void main(String[] args) {
                    try {
                        int x = 4;
                        int y = 0;
                        // y = x + 1; // 변수에 + 1
                        // y = F(x);
                        MethodBasics methodBasics = new MethodBasics();
                        y = methodBasics.F(x);
            
                        y = y + 1; // 변수에 + 1
                        MethodBasics methodBasics_first = new MethodBasics();
                        y = methodBasics_first.F(y);  // F(0)
                        y = methodBasics_first.F(y);  // F(0)
            
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println();
                    // return 0;
                }
            } }
    // public int F(int x) //x = 4 , call by value
    //  { 
    //     int results = x + 1; 
    //     return results;
    //     // x + 1
    // }
    // public int Y (int y) {
    //     int calculate = y + 1;
    //     return calculate;
    // }

    // // fuction을 만들고 나서 이를 이용해야...

    // public static void main(String[] args) {
    //     try {
    //         int x = 4;
    //         int y = 0;
    //         MethodBasic methodBasic = new MethodBasic();
    //         y = methodBasic.F(x);
    //         // = > y = F(x);
    //         //MethodBasic의 class에 존재하는것들을 clone해옴. 
    //          // y = x + 1; 변수에 +1
    //         // y = F (x)인 경우 아직 인식을 못함.
    //         // 클래스 안에 있는지 없는지 모름. 클래스를 instance화 시킴.
    //         // function을 쓰려고 하지만 범위로 가려져 있어서 알 수 없음.
    //         // F(x)의 function을 사용하기 전에 method에서 function을 찾아서 가져옴.

    //         // instance화 시킨 class임.
    //         // class를 instance화 시킴 '()'='function화.'. = java 파일 이름 (). + 생성자 이름이 있어야함.
    //         //

    //         y = y + 1; // 변수에 +1
    //         MethodBasic methodBasic_first = new MethodBasic();
    //         y = methodBasic_first.F(0);
    //         y = methodBasic_first.F(y);
    //         //이렇게 되면 위에서 x = "y=0"인 0이 날아감. 
    //         //이렇게 되면 results= 0 + 1
    //         // return results = 1

    //         // MethodBasic Calculate =new MethodBasic ();
    //         // y = Calculate.Y(y);
    //         // y = methodBasic.F(y); 
            
    //         // y = Y (y);

    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    //     System.out.println();
        // return 0 ;
//     }
// }
