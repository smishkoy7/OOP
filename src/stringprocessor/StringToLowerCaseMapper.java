package stringprocessor;

public class StringToLowerCaseMapper implements StringProcessMapper{

    @Override
    public String stringProcces(String input) {
        
        return input.toLowerCase();
    }
}
