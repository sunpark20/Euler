class Fibonacci {
//재귀 함수로 하니 시간오버가 뜨네 다이나믹하게 결과를 쌓아가야한다.

    public long fibonacci(int num) {
        long a=0;
        long b=1;
        long c=0;
        num--;
        for(int i=0;i<num;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 48;
        System.out.println(c.fibonacci(testCase));
    }
}

