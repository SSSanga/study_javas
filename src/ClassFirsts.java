public class ClassFirsts {
    // public이 붙어있음
    int second = 0; // 이 second는 ClassFirsts()와 ClassFirsts(first)에 다 적용됨.
    // {이 바깥에 존재하기 때문에. }

    ClassFirsts() 
    //이 ClassFirsts는 java의 파일명이기도 하고 
    //java파일의 class의 이름이기도 하며 
    //class의 생성자의 이름이기도 함. 
    {
        System.out.println();
    }

    ClassFirsts(int first) {
        this.second = first; // 이 파라미터를 사용 가능..??ㅠㅠ
        System.out.println(first);
    }

    public int getSecond //"return type" 
    (){ return this.second;}
//같은 선상의 class 생성
}
