public class Main {
    public static void main(String[] args) {
        // Шаг 1 и Шаг 2: Создание, вывод и сравнение товаров
        Product product1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product product2 = new Product(101, "Смартфон Pro", 65000, "Электроника");
        Product product3 = new Product(102, "Ноутбук", 90000, "Электроника");
        Product product4 = new Product(101, "Смартфон", 50000, null);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        System.out.println(product1.equals(product2)); // true
        System.out.println(product1.equals(product3)); // false
        System.out.println(product1.equals(product4)); // false

        // Шаг 3: Создание, вывод и сравнение заказов
        Product[] basket1 = {product1, product3};
        Product[] basket2 = {product2, product3};
        Product[] basket3 = {product3, product1};

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2);
        Order order3 = new Order("Иван Иванов", basket3);
        Order order4 = new Order("Петр Петров", basket1);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println(order1.equals(order2)); // true
        System.out.println(order1.equals(order3)); // false
        System.out.println(order1.equals(order4)); // false
    }
}
