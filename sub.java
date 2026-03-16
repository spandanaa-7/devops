public class AddNumbers {

    // Function to add two numbers
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Function to subtract two numbers
    static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Calling the add function
        int result = add(num1, num2);

        // Calling the subtract function
        int subResult = subtract(num1, num2);

        System.out.println("Sum = " + result);
        System.out.println("Subtraction = " + subResult);
    }
}
