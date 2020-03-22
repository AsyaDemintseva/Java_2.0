public class MathOperationsException {
    public static Double addition(double a, double b){
        a += b;
        return a;
    }

    public static Double subtraction(double a, double b){
        a -= b;
        return a;
    }

    public static Double miltiplication(double a, double b){
        a *= b;
        return a;
    }

    public static Double division(double a, double b){
        a /= b;
        return a;
    }

    public static Double sqr(double a){
        a *= a;
        return a;
    }

    public static Double sqrt(double a){
        a = Math.sqrt(a);
        return a;
    }

}