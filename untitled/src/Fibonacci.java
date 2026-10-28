import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

class Fibonacci {

    void main() {
        String startNumberString = IO.readln("Enter the start number: ");

        int number;
        try {
            number = Integer.parseInt(startNumberString);
        } catch (Exception e) {
            throw new RuntimeException("String '" + startNumberString + "' is not a number");
        }

        if (number < 0) {
            throw new RuntimeException("Number '" + number + "' is not a positive number");
        }

        int randomNum = ThreadLocalRandom.current().nextInt(5, 10);
        IO.println("Generating a sequence with a limit of " + randomNum + " numbers");

        List<Integer> sequence = getSequence(number, randomNum);
        String sequenceString = sequence.stream().map(Object::toString).collect(Collectors.joining(", "));
        IO.println(sequenceString);
    }

    public List<Integer> getSequence(int start, int limit) {
        List<Integer> sequence = new ArrayList<>(limit + 2);
        int sum;
        int x = start;
        int y = 1;

        sequence.add(x);
        sequence.add(y);

        for (int i = 0; i < limit; i++) {
            sum = x + y;
            sequence.add(sum);

            x = y;
            y = sum;
        }

        return sequence;
    }
}
