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

    String showInfo() {
        return "[ Nazwa produktu: " + name
                + ", cena: " + price
                + ", opis: " + desc + " ]";
    }

    void getProductInfo() {
        if (null != category.name) {
            System.out.println(showInfo()
                    + category.showInfo());
        } else {
            System.out.println(showInfo() + "[ !!! brak kategorii !!! ]");

        }
    }

}

