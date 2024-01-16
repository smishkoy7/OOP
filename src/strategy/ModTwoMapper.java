package strategy;

public class ModTwoMapper implements NumberMapper{
    @Override
    public double mapNumber(double input) {
        return input % 2;
    }
}
