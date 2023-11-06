// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void isLeapYear(int year){
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            System.out.println(year+" Год является високосным");
        } else {
            System.out.println(year+" Год не является високосным");
        }
    }
    public static void printAppVersion (int clientOS, int clientDeviceYear){
        if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        else if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для ios по ссылке");
    }
    public static int calculateDelivTime(int deliveryDistance){
        if (deliveryDistance <= 20) System.out.println("Доставка займет 1 день");
        else if (deliveryDistance > 20 && deliveryDistance <= 60) System.out.println("Доставка займет 2 дня");
        else if (deliveryDistance > 60 && deliveryDistance <= 100) System.out.println("Доставка займет 3 дня");
        else System.out.println("Доставка дальше 100 км не идет");
        return deliveryDistance;
    }


    public static void main(String[] args) {
        isLeapYear(2015);
        printAppVersion(1, 2011);
        calculateDelivTime(22);
        }
    }