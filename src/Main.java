import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientIos = 0;
        int clientAndroid = 1;
        if (clientIos > clientAndroid) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        long clentDeviceYear = 2016L;
        if (clientIos > clientAndroid && clentDeviceYear >= 2015) {
            System.out.println("Установите последнюю версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите последнюю версию приложения для Android по ссылке");
        }
        if (clientIos > clientAndroid && clentDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задача 3
        long year = 2021L;
        boolean notALeapYear = year != 4 && year != 400 && year >= 100;
        if (notALeapYear) {
            System.out.println(+year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;
        int limitation = 20;
        int stepDistance = 40;
        int numberDays = 1;
        if (deliveryDistance > limitation) {
            numberDays += ((deliveryDistance - limitation) / stepDistance);
            if ((deliveryDistance - limitation) % stepDistance > 0) {
                numberDays++;
            }
        }
        System.out.println("Потребуется дней: " + numberDays);
        //Я скопировал это решение из чата, а так мня б проконсультировать в этом задании, что тут сделали???

        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }

    }
}