package ex3;

class MathOperations {

    boolean isEven(int even) {
        if (even % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int odd) {
        if (odd % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    double circleField(double radius) {
        double Field = Math.round(3.14 * radius * radius);
        return Field;
    }

    int power(int pow) {
        return pow * pow;
    }

}
