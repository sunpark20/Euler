public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] empty=str.split(" ");

        int min=Integer.parseInt(empty[0]);
        int max=min;

        for(int i=1;i<empty.length;i++){
            if(min > Integer.parseInt(empty[i]))
                min = Integer.parseInt(empty[i]);
            if(max < Integer.parseInt(empty[i]))
                max = Integer.parseInt(empty[i]);
        }
        str=Integer.toString(max)+" "+Integer.toString(min);
        return str;
    }

    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
