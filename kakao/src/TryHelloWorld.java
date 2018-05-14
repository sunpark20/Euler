import java.util.Arrays;

public class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        //최대공약수 구한다고 a,b를 바꿀거라서 복사 해놓음.
        int a2=a;
        int b2=b;
        if(a<b){
            int c=a;
            a=b;
            b=c;
        }
        //최대공약수 구하기
        int reminder;
        while(true){
            reminder=a%b;
            if(reminder==0){
                answer[0]=b;
                break;
            }
            a=b;
            b=reminder;
        }


        //최소공배수 구하기
        //a2, b2를 이용합니다.
        //소수 배열 만들기
        int[] prime={2,	3,	5,	7,	11,	13	,17	,19	,23	,29	,31	,37	,41	,43	,47	,53	,59	,61	,67	,71,79,83,	89,	97,	101};
        int[] indicesA=new int[prime.length];
        int[] indicesB=new int[prime.length];
        for(int i=0;i<indicesA.length;i++){
            indicesA[i]=0;
            indicesB[i]=0;
        }

        for(int j=0;j<prime.length;j++) {
            while(true) {
                if(a2==1)
                    break;//60 30 15 5 1
                if(a2%prime[j]!=0)
                    break;
                a2/=prime[j];
                indicesA[j]++;
            }
        }

        for(int j=0;j<prime.length;j++) {
            while(true) {
                if(b2==1)
                    break;
                if(b2%prime[j]!=0)
                    break;
                b2/=prime[j];
                indicesB[j]++;
            }
        }

//        //상태보기 프린트
//        for(int i=0;i<indicesA.length;i++){
//            System.out.println(i+"번째 indicesA는?"+indicesA[i]+" indicesB는?  "+indicesB[i]);
//        }60 48  gcd 12 lcm 240

        //이래놔야 곱한다.
        answer[1]=1;

        int[] indicesC=new int[prime.length];
        for(int i=0;i<indicesA.length;i++){
            indicesC[i]=indicesA[i];
            if(indicesA[i] < indicesB[i])
                indicesC[i]=indicesB[i];
            if(indicesC[i]==0){
                continue;
            }
            for(int j=0;j<indicesC[i];j++){
                answer[1]*=prime[i];
            }
        }
        //lcm구함

        return answer;
    }



    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(6, 83)));
    }
}

