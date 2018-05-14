import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String str) {
        String s1="";
        String s2="";
        for(int i=0;i<str.length();i++){
            if(65<=str.charAt(i) && str.charAt(i) <=90)
                s1+=str.charAt(i);
            else
                s2+=str.charAt(i);
        }
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);

        char[] c2=s2.toCharArray();
        Arrays.sort(c2);

        s1="";s2="";
        for(int i=0;i<c1.length;i++){
            s1+=c1[i];
        }
        for(int i=0;i<c2.length;i++){
            s2+=c2[i];
        }
        StringBuilder sb1=new StringBuilder(s1);
        sb1=sb1.reverse();
        StringBuilder sb2=new StringBuilder(s2);
        sb2=sb2.reverse();

        return sb2.toString()+sb1.toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("VkSGVARWctcS") );
    }
}