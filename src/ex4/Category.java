package ex4;

public class Category {
    String name;
    String desc;

    Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    Category() {
    }

    String showInfo() {
        return "[ kategoria: " + name
                + ", opis: " + desc + " ]";
    }
}
