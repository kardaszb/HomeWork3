package ex4;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Category category = new Category("slodycze","cos slodkiego dla kazdego");
        Category category1 = new Category("napoje","cudze chwalicie swojego nie znacie");
        Category category2 = new Category();

        Product product = new Product("baton",2.5,"baton o smaku czekoladowym",category);
        Product product1 = new Product("lizaki",1.25,"lizaki o smaku coli",category);
        Product product2 = new Product("herbata",8.99,"herbata owocowa",category1);
        Product product3 = new Product("maseczki",99.99,"maseczki z filterm HEPA",category2);

        SpecialOffer specialOffer = new SpecialOffer(product,"znizka na snickersy",0.2, LocalDate.of(2020,4,30));

        product.showInfo();
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();

        specialOffer.showInfo();


    }
}
