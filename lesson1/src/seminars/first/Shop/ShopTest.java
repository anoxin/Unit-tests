package seminars.first.Shop;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;


public class ShopTest {

    // 1. Напишите тесты, чтобы проверить, что магазин хранит верный список
    // продуктов (правильное количество продуктов, верное содержимое корзины).
    public static Shop getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(300, "product1"));
        products.add(new Product(200, "product2"));
        products.add(new Product(100, "product3"));

        Shop shop = new Shop(null);

        shop.setProducts(products);
        return shop;
    }

    public static void testGetProducts() {
        Shop shop = getProducts();

        List<Product> actualProducts = shop.getProducts();
        assertThat(shop.getProducts().size() == actualProducts.size());
        assertThat(actualProducts.containsAll(shop.getProducts()));
        System.out.println("Тест testGetProducts() пройден");
        
    }

    // 2. Напишите тесты для проверки корректности работы метода
    // getMostExpensiveProduct.
    public static void testGetMostExpensiveProduct() {
        Shop shop = getProducts();

        assertThat(shop.getMostExpensiveProduct().getCost() == 300);
        System.out.println("Тест getMostExpensiveProduct пройден");
    }

    // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice
    // (проверьте правильность сортировки).
    public static void testSortProductsByPrice() {
        Shop shop = getProducts();
        shop.sortProductsByPrice();

        assertThat(shop.getProducts().get(0).getCost() == 100 || shop.getProducts().get(1).getCost() == 200
                || shop.getProducts().get(2).getCost() == 300);
                System.out.println("Тест sortProductsByPrice пройден");
    }

}