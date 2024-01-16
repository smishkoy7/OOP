package stringprocessor;

public class Main {
    public static void main(String[] args) {
        final String input = "Suka Blyat";

        System.out.println(new StringToUpperCaseMapper().stringProcces(input));
        System.out.println(new StringToLowerCaseMapper().stringProcces(input));
    }

}
