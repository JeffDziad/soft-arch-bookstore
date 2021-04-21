package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Original Program");

        Product book1Hardcover = new HardcoverBook("The Hunger Games", "9780439023528",
                8.79, 12,
                LocalDate.of(2010, Month.JULY, 3),
                "Suzanne Collins", 384);
        Product book2Paperback = new PaperbackBook("A Wrinkle in Time", "9780312367541",
                6.19, 4,
                LocalDate.of(2007, Month.MAY, 1),
                "Madeleine L'Engle", 256);
        Product record = new VinylRecord("Kind of Blue",
                13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46));
        Product album = new VinylRecord("Suburban Lengend", 15.99, 21,
                LocalDate.of(2020, Month.APRIL, 20),
                "Rock Kop", Duration.ofMinutes(76));

        List<Product> products = new ArrayList<>();
        products.add(book1Hardcover);
        products.add(book2Paperback);
        products.add(record);
        products.add(album);

        int count = 1;
        System.out.println("Products Available: ");
        for (Product product : products) {
            System.out.printf("%d: %s - $%.2f%n", count, product.getTitle(), product.getCost());
            count++;
        }
    }
}
