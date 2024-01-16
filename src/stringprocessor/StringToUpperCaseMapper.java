package stringprocessor;

public class StringToUpperCaseMapper implements StringProcessMapper{

    @Override
    public String stringProcces(String input) {
        return input.toUpperCase();
    }
}
