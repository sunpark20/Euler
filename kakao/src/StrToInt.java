public class StrToInt {
    public int getStrToInt(String str) {
        int a=0;
        int result;
        char c=str.charAt(0);
        char fc='-';
        if(c=='-')
            a=1;
        result=Integer.parseInt(str.substring(a,str.length()));
        if(c==fc){
            result*=-1;
        }

        return result;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("1055"));
    }
}

