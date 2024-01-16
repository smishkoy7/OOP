package strategy;

public class PlusFiveMapper implements NumberMapper{
    @Override
    public double mapNumber(double input) {
        return input + 5;
    }
}
