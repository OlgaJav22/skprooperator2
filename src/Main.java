public class Main {
    public static void main(String[] args) {

       //задание 1
        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //задача 2

        int clientDeviceYear = 2014;
        if (clientOS ==0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS ==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //задача 3

        int year = 2100;
        if (year%400==0) {
            System.out.println(year + " год является високосным");
        } else if (year%100==0) {
            System.out.println(year + " год не является високосным");
        } else if (year%4==0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //задача 4

        int deliveryDistance = 65;
        int deliveryDay=1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >20 && deliveryDistance<60) {
            System.out.println("Потребуется дней: " + (deliveryDay+1));
        } else if (deliveryDistance>=60 && deliveryDistance<100) {
            System.out.println("Потребуется дней: " + (deliveryDay+2));
        }

        //задача 5

        int monthNumber = 5;

        switch (monthNumber) {
            case 1:
                System.out.println("Зимний месяц январь");
                break;
            case 2:
                System.out.println("Зимний месяц февраль");
                break;
            case 3:
                System.out.println("Весенний месяц март");
                break;
            case 4:
                System.out.println("Весенний месяц апрель");
                break;
            case 5:
                System.out.println("Весенний месяц май");
                break;
            case 6:
                System.out.println("Летний месяц июнь");
                break;
            case 7:
                System.out.println("Летний месяц июль");
                break;
            case 8:
                System.out.println("Летний месяц август");
                break;
            case 9:
                System.out.println("Осенний месяц сентябрь");
                break;
            case 10:
                System.out.println("Осенний месяц октябрь");
                break;
            case 11:
                System.out.println("Осенний месяц ноябрь");
                break;
            case 12:
                System.out.println("Зимний месяц декабрь");
                break;
            default:
                System.out.println("Некорректные данные");
        }
    }
}