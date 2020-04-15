package ex5;

class Televisor {
    boolean televisorState;

    void turnOn() {
        televisorState = true;
    }

    void turnOff() {
        televisorState = false;
    }

    void showStatus() {
        System.out.println(televisorState);
    }
}
