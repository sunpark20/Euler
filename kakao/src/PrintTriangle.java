public class PrintTriangle {
    public String printTriangle(int num){
        String star="*";
        String result="";
        for(int i=0;i<num;i++){
            result+=star+"\n";
            star+="*";
        }
        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(5) );
    }
}