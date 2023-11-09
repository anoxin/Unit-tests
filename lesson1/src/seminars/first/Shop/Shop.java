package seminars.first.Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, new Comparator<Product>() { 
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost()-o2.getCost();
            }
        });
    
        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        sortProductsByPrice();
        
        return products.get(products.size() - 1);
    }

    @Override
    public String toString() {
        String arrString = "";
        for (Product product : products) {
            arrString += product.getTitle() + " - " + product.getCost() + ", "; 
            
        }
        return "[ " + arrString + " ]";
    }

}