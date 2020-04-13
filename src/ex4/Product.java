package ex4;

class Product {
    String name;
    double price;
    String desc;
    Category category;

    Product(String name, double price, String desc, Category category) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.category = category;
    }

    Product(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    void showInfo() {
        System.out.println(
                "[ Nazwa produktu: " + name
                        + ", cena: " + price
                        + ", opis: " + desc + " ]"
                        + "[ kategoria: " + category.name
                        + ", opis: " + category.desc + " ]"
        );
    }

}

