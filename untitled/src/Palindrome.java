import java.util.List;

class Palindrome {

    void main() {
        String input = IO.readln("Enter your input here: ");

        boolean result = isPalindrome(input);
        String resultString = result ? "a" : "not a";
        IO.println("The text is " + resultString + " palindrome");
    }

    public boolean isPalindrome(String input) {
        int length = input.length();
        char[] charArray = input.toCharArray();

        for (int i = 0; i < length; i++) {
            if (charArray[i] != charArray[length - (i + 1)]) {
                return false;
            }
        }

        return true;
    }

    public void test() {
        List<String> palindromes = List.of("123454321", "NITIN", "madam", "ma'am");
        List<String> notPalindromes = List.of("1245454321", "NIT3IN", "ma1");

        for (String palindrome : palindromes) {
            if (!isPalindrome(palindrome)) {
                throw new RuntimeException("String '" + palindrome
                        + "' is a palindrome but the implementation returned an incorrect result");
            }
        }

        for (String notPalindrome : notPalindromes) {
            if (isPalindrome(notPalindrome)) {
                throw new RuntimeException("String '" + notPalindrome
                        + "' is not a palindrome but the implementation returned an incorrect result");
            }
        }

        IO.println("Test suite successfully ran");
    }
}
