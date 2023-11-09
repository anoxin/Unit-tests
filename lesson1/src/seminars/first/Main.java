package seminars.first;


import static org.assertj.core.api.Assertions.*; // Импортируем классы библиотеки assertJ

import java.util.ArrayList;
import java.util.List;

import seminars.first.Calculator.Calculator;
import seminars.first.Shop.Product;
import seminars.first.Shop.Shop;
import seminars.first.Shop.ShopTest;

// Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент 
// скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. 
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. 
// Не забудьте написать тесты для проверки этого поведения.

// *Задание 2. (необязательное) *
// Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
// Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), который 
// возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное 
// количество продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности
//  работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания экземпляров 
//  продуктов и класс Shop для написания методов сортировки и тестов.

public class Main {
    public static void main(String[] args) {
        // Задание 1
        calculatorTest(110, 30);
        // Задание 2
        List<Product> products = new ArrayList<>();
        products.add(new Product(50, "Арбуз"));
        products.add(new Product(40, "Банан"));
        products.add(new Product(80, "Кекс"));
        products.add(new Product(60, "Лимон"));

        Shop shop = new Shop(products);
        System.out.println(shop.toString());
        shop.sortProductsByPrice();
        System.out.println(shop.toString());
        System.out.println(shop.getMostExpensiveProduct().getTitle() + "-" + shop.getMostExpensiveProduct().getCost());

        ShopTest.testGetProducts();
        ShopTest.testGetMostExpensiveProduct();
        ShopTest.testSortProductsByPrice();

    
    }
    public static void calculatorTest(int sum, int discount) {
        if (sum <= 0 || sum > Integer.MAX_VALUE) {
            System.out.println("Неверная сумма");
             assertThatThrownBy(() ->
               Calculator.calculateDiscount(sum, discount)
        ).isInstanceOf(ArithmeticException.class);
            
        } else if (discount > 100 || discount < 0) {
            System.out.println("Неверный процент");
            assertThatThrownBy(() ->
               Calculator.calculateDiscount(sum, discount)
        ).isInstanceOf(ArithmeticException.class);

        } else {
            System.out.println("Тест пройден результат: " + Calculator.calculateDiscount(sum, discount));
        }
    
    }


}