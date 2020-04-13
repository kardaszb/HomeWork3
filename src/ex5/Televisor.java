package ex5;

class Televisor {
    boolean televisorState;

    boolean turnOn() {
        televisorState = true;
        return true;
    }

    boolean turnOff() {
        televisorState = false;
        return false;
    }

    void showStatus() {
        System.out.println(televisorState);
    }
}
