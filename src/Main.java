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

        // задача 6*

        int age = 23;
        int salary = 88000;
        int limitMin = salary*2;
        int limitMax = salary*3;

        if (age>=23 && salary <50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limitMax + " рублей ");
        } else if (age>=23 && salary >=50000 && salary <80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (limitMax*1.2) + " рублей ");
        } else if (age<23 && salary <50000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limitMin + " рублей ");
        } else if (age <23 && salary >= 50000 && salary <80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (limitMin*1.2) + " рублей ");
        } else if (age>=23 &&salary >=80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (limitMax*1.5) + " рублей ");
        } else if (age <23 && salary >=80000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (limitMin*1.5) + " рублей ");
        }

        //ЗАДАЧА 7*

        int age1 = 27;
        int salary1 = 72_000;
        int wantedSum = 330_000;
        double creditPeriod = 12; // срок кредита
        int paymentMaxMonthly = salary1/2; // ежемесячный платеж 50%
        double creditPercent = 0.1; // 10% ставка по кредиту
        double creditPercent1 = 0.005;
        double creditPercent2 = 0.01;
        double paymentCredit = wantedSum*((1+creditPercent-0.007)/creditPeriod); // если з/пл больше 80_000 р.
        double paymentCredit1 = wantedSum*((1+creditPercent+ creditPercent1)/creditPeriod); // если возраст меньше 30 лет
        double paymentCredit2 = wantedSum*((1+creditPercent + creditPercent2)/creditPeriod); // если возраст меньше 23 лет
        boolean paymentPossible= paymentMaxMonthly>paymentCredit; // для базовой ставик
        boolean paymentPossible1= paymentMaxMonthly>paymentCredit1; // верно для возраста меньше 30 лет
        boolean paymentPossible2= paymentMaxMonthly>paymentCredit2; //верно для возраста меньше 23 лет

        if (salary >80_000 && paymentPossible){
            System.out.println("Максимальный платеж при з/пл " + salary1 + " равен " +  paymentMaxMonthly + " рублей. Платеж по кредиту " + paymentCredit+ " рублей. Одобрено");
        } else
        if (age1<30 && age >= 23 && salary1 <=80_000 && paymentPossible1) {
            System.out.println("Максимальный платеж при з/пл " + salary1 + " равен " +  paymentMaxMonthly + " рублей. Платеж по кредиту " + paymentCredit1+ " рублей. Одобрено");

        } else  if (age1<23 && salary1 <=80_000 && paymentPossible2){
            System.out.println("Максимальный платеж при з/пл " + salary1 + " равен " +  paymentMaxMonthly + " рублей. Платеж по кредиту " + paymentCredit2+ " рублей. Одобрено");
        } else {
            System.out.println("Вам отказано");
        }


    }

}