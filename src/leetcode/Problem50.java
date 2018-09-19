package leetcode;

public class Problem50 {

    public static void main(String[] args) {
        Problem50 demo = new Problem50();
        System.out.println(demo.myPow(2, 10));
    }
    public double myPow(double x, int n) {

        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        int t = n / 2;
        if (n < 0){
            x = 1 / x;
            t = -t;
        }

        double half_result = myPow(x, t);
        if(n % 2 == 0)
            return half_result * half_result;
        return half_result * half_result * x;
    }

}
