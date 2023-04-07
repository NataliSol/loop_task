public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        for (int i = 6; i > 0; i--) {
            System.out.print(i + " ");
            for (int j = i; j > 0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("task 2");
        int factorial = 5;
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(factorial + "! = " + result);
    }
}
