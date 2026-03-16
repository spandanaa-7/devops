public class AddNumbers {

    // Function to add two numbers
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Calling the function
        int result = add(num1, num2);

        System.out.println("Sum = " + result);
    }
}
