
public class WaterMelon {
    public String watermelon(int n){
        String resultString="";
        for(int i=0;i<n;i++){
            if(i%2==0)
                resultString+="수";
            else
                resultString+="박";
        }
        return resultString;
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}