import org.apache.commons.lang3.StringUtils;
public class MavenClass {
    public static void main(String[] args) {
        String userInput = "12345";
        boolean isNumeric = StringUtils.isNumeric(userInput);
        System.out.println("Is a number: " + isNumeric);
        String input2 = "Hello World";
        String swappedCase = StringUtils.swapCase(input2);
        System.out.println("Swapped Case: " + swappedCase);
        String input3 = "abcdef";
        String reversed = StringUtils.reverse(input3);
        System.out.println("Reversed: " + reversed);
    }
}
