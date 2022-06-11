import models.Pizza;
import models.PizzaSizeNotFoundException;
import models.PizzaSizeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pizza> listOfPizzas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Please, enter name of the pizza: ");
            String name = scanner.next();
            System.out.println("Please, enter price of the pizza: ");
            int price = scanner.nextInt();
            System.out.println("Please, enter size of the pizza: ");
            int size = scanner.nextInt();
            try {
                listOfPizzas.add(new Pizza(name, price, PizzaSizeEnum.getPizzaSizeNameBySize(size)));
            } catch (PizzaSizeNotFoundException p) {
                System.out.println(p.getMessage());
            }
            System.out.println(listOfPizzas);
        }
        System.out.println(listOfPizzas);
    }
}