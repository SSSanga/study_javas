import java.util.HashMap;

public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); // key 삽입_null 1 key: first
            hashMap.put("second", 2); // key 삽입_null 2 key: second
            hashMap.put("third", 3); // key 삽입_null  0 key: third
            hashMap.get("third"); // key 불러오기_Integer@51 "3" value:3
            hashMap.size(); //3
            hashMap.put("second",5); // key_변경_Integer@44 "2" value:2 > HashMap$Node@46 "second":"5"
            hashMap.remove("second"); // key 삭제_Integer@502 "5"value:5
            hashMap.keySet(); // key list 정보_HashMap$KeySet@512 size=2_0:"third, 1:"first"
            hashMap.values(); // key value 확인_HashMap$Values@515 size=2_0:Integer@51 "3"+value:3, 1: Integer@29 "1"+value:1
            hashMap.clear(); // (void)
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
