public class PrimeNumber {

    void main() {
        String inputString = IO.readln("Enter your number here: ");
        int number;
        try {
            number = Integer.parseInt(inputString);
        } catch (Exception e) {
            throw new RuntimeException("String '" + inputString + "' is not a number");
        }

        if (number < 0) {
            throw new RuntimeException("Number '" + number + "' is not a positive number");
        }

        boolean primeNumber = isPrimeNumber(number);
        String output = primeNumber ? "a" : "not a";
        IO.println("Number '" + number + "' is " + output + " prime number");
    }

    boolean isPrimeNumber(int number) {
        for (int i = 0; i < number; i++) {
            int currentNumber = number - (i + 1);
            if (currentNumber == 1) {
                break;
            }

            if ((number) % currentNumber == 0) {
                return false;
            }
        }

        return true;
    }
}
