package ex1;

class Room {
    public static void main(String[] args) {
        Heater heater1 = new Heater(300, "white", "1000x1500x200");
        Heater heater2 = new Heater(400, "black", "1000x1000x200");
        heater1.showInfo();
        heater2.showInfo();
    }
}
