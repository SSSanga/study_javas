package cases;

import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            // column_송명주님 png참고
            // NAME, GENDER, AGE, HEIGHT, WEIGHT, BLOODPRESSURE,BLOODSUGAR,
            // RESULT, RECHECK, MAINTENANCEPLAN
            ArrayList <HashMap> Patients = new ArrayList <HashMap>();
            
            HashMap<String,String> Categories = new HashMap<String,String>();
            Categories.put("NAME", "Name");
            Categories.put("GENDER", "Gender");
            Categories.put("AGE", "Age"); 
            Categories.put("HEIGHT", "Height");
            Categories.put("WEIGHT", "Weight");
            Categories.put("BLOODPRESSURE", "BloodPressure");
            Categories.put("BLOODSUGAR","BloodSugar");
            Categories.put("RESULT","Result");
            Categories.put("RECHECK","Recheck");
            Categories.put("MAINTENANCEPLAN", "MaintenancePlan");
            //항목
            // ArrayList에 넣자.<HashMap>
            Patients.add(Categories);

            Categories = new HashMap<String,String>();
            Categories.put("NAME", "홍길동");
            Categories.put("GENDER", "남");
            Categories.put("AGE", "30"); 
            Categories.put("HEIGHT", "175");
            Categories.put("WEIGHT", "75");
            Categories.put("BLOODPRESSURE", "120/80");
            Categories.put("BLOODSUGAR","90");
            Categories.put("RESULT","비정상");
            Categories.put("RECHECK","폐암, 갑상선 질환");
            Categories.put("MAINTENANCEPLAN", " ");
            //1행 완. 
            // ArrayList에 넣자.<HashMap>
            Patients.add(Categories);

            Categories = new HashMap<String,String>();
            Categories.put("NAME", "김영희");
            Categories.put("GENDER", "여");
            Categories.put("AGE", "25"); 
            Categories.put("HEIGHT", "160");
            Categories.put("WEIGHT", "55");
            Categories.put("BLOODPRESSURE", "110/70");
            Categories.put("BLOODSUGAR","85");
            Categories.put("RESULT","비정상");
            Categories.put("RECHECK","간암, 뇌졸중");
            Categories.put("MAINTENANCEPLAN", " ");
            //2행 완.
            Patients.add(Categories); 

            Categories = new HashMap<String,String>();
            Categories.put("NAME", "박철수");
            Categories.put("GENDER", "남");
            Categories.put("AGE", "45"); 
            Categories.put("HEIGHT", "180");
            Categories.put("WEIGHT", "85");
            Categories.put("BLOODPRESSURE", "130/85");
            Categories.put("BLOODSUGAR","100");
            Categories.put("RESULT","정상");
            Categories.put("RECHECK","심장 질환");
            Categories.put("MAINTENANCEPLAN", "식습관 개선, 운동 계획");
            //3행 완. 
            Patients.add(Categories);

            Categories = new HashMap<String,String>();
            Categories.put("NAME", "이지은");
            Categories.put("GENDER", "여");
            Categories.put("AGE", "35"); 
            Categories.put("HEIGHT", "165");
            Categories.put("WEIGHT", "60");
            Categories.put("BLOODPRESSURE", "115/75");
            Categories.put("BLOODSUGAR","95");
            Categories.put("RESULT","비정상");
            Categories.put("RECHECK","간암, 알츠하이머병");
            Categories.put("MAINTENANCEPLAN", " ");
            //4행 완. 
            Patients.add(Categories);
            
            Categories = new HashMap<String,String>();
            Categories.put("NAME", "최민호");
            Categories.put("GENDER", "남");
            Categories.put("AGE", "28"); 
            Categories.put("HEIGHT", "170");
            Categories.put("WEIGHT", "70");
            Categories.put("BLOODPRESSURE", "125/80");
            Categories.put("BLOODSUGAR","92");
            Categories.put("RESULT","정상");
            Categories.put("RECHECK","간암");
            Categories.put("MAINTENANCEPLAN", " ");
            //5행 완. 
            Patients.add(Categories);
            
            // Patients (ArrayList)에 각 행들을 넣었으면 for each문으로 출력할것, 
            // 기억하는 for each문 for(HashMap 변수 inform: )오오오 HashMap인건 맞닷
            // for (type variableName (변수 이걸 이용해서 type에 있는걸 불러올거임. ':'콜론도 기억할것. arrayName(array or arrayList)) {}
            for (HashMap<String,String> inform :Patients){
                System.out.println(inform.get("NAME") + "/" 
                + inform.get("GENDER") + "/"
                + inform.get("AGE") + "/"
                + inform.get("HEIGHT") + "/"
                + inform.get("WEIGHT") + "/"
                + inform.get("BLOODPRESSURE") + "/"
                + inform.get("BLOODSUGAR") + "/"
                + inform.get("RESULT") + "/"
                + inform.get("RECHECK") + "/"
                + inform.get("MAINTENANCEPLAN"));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("END");
    }
}
// Results
// Name/Gender/Age/Height/Weight/BloodPressure/BloodSugar/Result/Recheck/MaintenancePlan
// 홍길동/남/30/175/75/120/80/90/비정상/폐암, 갑상선 질환/ 
// 김영희/여/25/160/55/110/70/85/비정상/간암, 뇌졸중/
// 박철수/남/45/180/85/130/85/100/정상/심장 질환/식습관 개선, 운동 계획
// 이지은/여/35/165/60/115/75/95/비정상/간암, 알츠하이머병/
// 최민호/남/28/170/70/125/80/92/정상/간암/