public class AssertionExample {
    public static void main(String[] args) {
        // get a number in the first argument
        int number = Integer.parseInt(args[0]);

        assert number <= 10; // stops if number > 10

        System.out.println("Pass");

    }
}
