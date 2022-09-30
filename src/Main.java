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

    }
}