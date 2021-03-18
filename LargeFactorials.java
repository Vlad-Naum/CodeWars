package zadachi;

import java.math.BigInteger;

public class LargeFactorials {
    public static String Factorial(int n) {
        String str = new String();
        if (n < 0){
            return null;
        }
        if (n == 0){
            return "1";
        }
        BigInteger l = new BigInteger("1");
        for (int i = n; i > 0; i--) {
            l = l.multiply(BigInteger.valueOf(i));
        }
        return str += l;
    }
}
