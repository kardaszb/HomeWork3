package ex5;

public class Test {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.televisorState = false;

        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }





}
