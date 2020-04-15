package ex3;

class MathOperations {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    double circleField(double radius) {
        double field = Math.round(3.14 * radius * radius);
        return field;
    }

    int power(int pow) {
        return pow * pow;
    }

}
