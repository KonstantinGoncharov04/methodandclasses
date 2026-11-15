//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// 1. Создание и вывод товаров
    Product phone1 = new Product(101, "Смартфон X", 50000, "Электроника");
    Product phone2 = new Product(101, "Смартфон X Pro", 65000, "Электроника");
    Product laptop = new Product(102, "Ноутбук Z", 90000, "Электроника");
    Product phoneNullCat = new Product(101, "Смартфон X", 50000, null);

    System.out.println("=== Товары ===");
    System.out.println(phone1);
    System.out.println(phone2);
    System.out.println(laptop);
    System.out.println(phoneNullCat);

    // Попарное сравнение товаров
    System.out.println("\n=== Сравнение товаров ===");
    System.out.println("phone1 == phone2 (одинаковые id и category): " + phone1.equals(phone2)); // true
    System.out.println("phone1 == laptop (разные id): " + phone1.equals(laptop)); // false
    System.out.println("phone1 == phoneNullCat (одна категория null): " + phone1.equals(phoneNullCat)); // false

    // 2. Создание и вывод заказов
    Product[] basket1 = {phone1, laptop};
    Product[] basket2 = {phone2, laptop}; // товары считаются равными по equals()
    Product[] basket3 = {laptop, phone1}; // другой порядок товаров

    Order order1 = new Order("Иван Иванов", basket1);
    Order order2 = new Order("Иван Иванов", basket2);
    Order order3 = new Order("Иван Иванов", basket3);
    Order order4 = new Order("Петр Петров", basket1);

    System.out.println("\n=== Заказы ===");
    System.out.println(order1);
    System.out.println(order2);
    System.out.println(order3);

    // Попарное сравнение заказов
    System.out.println("\n=== Сравнение заказов ===");
    System.out.println("order1 == order2 (одинаковый покупатель и равные товары): " + order1.equals(order2)); // true
    System.out.println("order1 == order3 (нарушен порядок товаров): " + order1.equals(order3)); // false
    System.out.println("order1 == order4 (разные покупатели): " + order1.equals(order4)); // false
}
