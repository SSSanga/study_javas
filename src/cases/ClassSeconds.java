package cases;

public class ClassSeconds {
    // 파라미터가 1개 있는 생성자를 만든다.
    public int third = 0; // 초기화
    // 파라미터를 constructor로 할때는먼저 비어있어야함.
    // public = 제시자는 그냥 꼭 넣자.

    public ClassSeconds() {

    }

    public ClassSeconds(int notyet) {
        this.third = notyet;
        System.out.println("Chaos");
    }

    public int getThird() {
        return this.third;
    }
}
// root = project 프로그램상에선 src가 시작점임.
// 이때 하위 폴더가 생기면 package로 묶음. (컴파일할때 중요한 값임. )
// ex)System.out 이 결국 package로 묶여있는것임.
// package = 컴파일된 것의 파일 위치.
// package 에 있는 class를 부를땐?