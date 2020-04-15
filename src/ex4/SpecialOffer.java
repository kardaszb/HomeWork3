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

    String showInfo() {
        return "Rabat: \n[ Nazwa produktu: " + product.name
                + ", cena po rabacie: " + discountAmount()
                + ", opis: " + desc
                + " -> " + Period() + " ]";
    }

    void getSpeciallInfo() {
        if (null != product.category.name) {
            System.out.println(showInfo()
                    + product.category.showInfo());
        } else {
            System.out.println(showInfo() + "[ !!! brak kategorii !!! ]");

        }
    }

}
