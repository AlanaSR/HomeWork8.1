import java.time.LocalDate;

public class Main {
    private static void foundLeapYear(int year) {
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void chooseVerOs(int clientDeviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        String osName = clientOs == 0 ? "IOS" : "Android";
        String ver = clientDeviceYear < currentYear ? " облегченную " : " ";
        System.out.println("Установите " + ver + " версию приложения для " + osName + " по ссылке");
    }

    public static void deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2021;
        foundLeapYear(year);

        System.out.println("Task 2");
        chooseVerOs(2017, 0);

        System.out.println("Task 3");
        deliveryTime(46);
    }
}










