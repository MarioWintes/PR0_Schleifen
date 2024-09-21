public class NumberSumApp {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        
        while (i < 100) {
            i = i + 1;
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
