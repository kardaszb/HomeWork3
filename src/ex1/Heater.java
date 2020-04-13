package ex1;

class Heater {
    int power;
    String colour;
    String dimensions;

    Heater() {
    }

    Heater(int power, String colour, String dimensions) {
        this.power = power;
        this.colour = colour;
        this.dimensions = dimensions;
    }

    void showInfo() {
        System.out.println(
                "Heater power: " + power
                        + ", coloru: " + colour
                        + ", dimentions: " + dimensions
        );
    }
}
