package strategy;

public class Main {
    public static void main(String[] args) {
        final double input = 22.5;
        System.out.println("умножение на 10: " + map(input, new MultiplyTenMapper()));
        System.out.println("деление на 10: " + map(input, new DivideTenMapper()));
        System.out.println("сложение с 5: " + map(input, new PlusFiveMapper()));
        System.out.println("остаток от 2: " + map(input, new ModTwoMapper()));
//повторяется: sout, mapNumber(input).
        //отличается: сам текст, стратегию которую используем.
    }
    public static double map(double input, NumberMapper mapper){
        return mapper.mapNumber(input);
    }
}
