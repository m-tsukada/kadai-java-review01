
public class Clock {

    public static void main(String[] args) {
        int seconds = getSeconds(18, 32, 47);
        System.out.println(seconds);
    }
    
    public static int getSeconds(int h, int m, int s) {
        h = h * 60 * 60;
        m = m * 60;
        int result = h + m + s;
        return result;
    }

}
