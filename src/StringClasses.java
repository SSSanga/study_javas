public class StringClasses {
    public static void main(String[] args) {
        try {
            // string에 넣는것. 변수 이름 name
            String name = "Sang A Kim";
            name.equalsIgnoreCase("Sang A Kim");// true
            name.equalsIgnoreCase("Sang A K");// false
            // String name second = new String (); //생성자
            String name_second = new String("Puppy Cat Bee"); // 생성자
            name_second.equalsIgnoreCase("Puppy Cat Bee"); // true
            name_second.equalsIgnoreCase("Puppy Cat ee"); // false
            name_second.length();// 13
            name_second = name_second.replaceAll("a", "e");//"Puppy Cet Bee"
            String [] name_split_arrays = name_second.split(" ");
            String name_second_substring = name_second.substring(3,10);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0 ;
    }

}
