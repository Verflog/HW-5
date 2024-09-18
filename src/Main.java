public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи 1 и 2");
        byte clientOs = 1;
        short clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача 3");
        int year = 1984;
        short firstLeapYear = 1584;
        if (year < firstLeapYear) {
            System.out.println("Ещё не введён високосный год");
        }
        else if ((year % 4 == 0 & year % 100 != 0) | year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");

        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 1) {
            System.out.println("Расстояние введено неверно");
        }
        else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance <= 60) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц не определен");
        }
    }
}