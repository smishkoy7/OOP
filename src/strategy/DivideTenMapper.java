package strategy;

public class DivideTenMapper implements NumberMapper {

    @Override
    public double mapNumber(double input) {
        return input / 10;
    }
}
