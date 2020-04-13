package ex4;

import java.time.LocalDate;

class SpecialOffer {
    Product product;
    String desc;
    double discount;
    LocalDate endDate;
    String periodFromTo;

    LocalDate today = LocalDate.now();
    double discountAmount;


    SpecialOffer(Product product, String desc, double discount, LocalDate endDate) {
        this.product = product;
        this.desc = desc;
        this.discount = discount;
        this.endDate = endDate;
    }

    double discountAmount() {
        return discountAmount = product.price - (product.price * discount);
    }

    String Period() {
        return periodFromTo = "obowiazuje w okresie: " + today.toString() + " - " + endDate.toString();
    }

    void showInfo() {
        System.out.println("Rabat: ");
        System.out.println(
                "[ Nazwa produktu: " + product.name
                        + ", cena po rabacie: " + discountAmount()
                        + ", opis: " + desc
                        + " -> " + Period() + " ]"
                        + "[ kategoria: " + product.category.name
                        + ", opis: " + product.category.desc + " ]"
        );

    }
}
