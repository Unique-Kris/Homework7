public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int total = 2_459_000;
        int month = 0;
        int money = 0;
        while (money < total) {
            money += 15000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + " рублей");
        }

        System.out.println("Задание 2");
        int num = 0;
        while (num < 10) {
            num++;
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Задание 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthrate = 17 * population / 1000;
            int dead = 8 * population / 1000;
            population = population + birthrate - dead;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");
        }

        System.out.println("Задание 4");
        int deposit = 15000;
        int monthNum = 0;
        while (total <= 12_000_000) {
            monthNum++;
            int percent = (deposit * 7) / 100;
            total = total + (deposit + percent);
            System.out.println("месяц " + monthNum + " сумма накоплений " + total + " рублей");
        }

        System.out.println("Задание 5");
        int sum = 15000;
        int monthNumber = 0;
        while (sum <= 12_000_000) {
            monthNumber++;
            int percent = (deposit * 7) / 100;
            sum = sum + (deposit + percent);
            if (monthNumber % 6 == 0) {
                System.out.println("месяц " + monthNumber + " сумма накоплений " + sum + " рублей");
            }
        }

        System.out.println("Задание 6");
        int sumMoney = 15000;
        int percentMoney = (sumMoney * 7) / 100;
        for (int i = 1; i < 9 * 12; i++) {
            total = total + (sumMoney + percentMoney);
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " сумма накоплений " + total + " рублей");
            }
        }

        System.out.println("Задание 7");
        int friday = 5;
        for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание 8");
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (int year = yearBefore; year < yearAfter; year++) {
            if (year % 79 == 0) System.out.println(year);
        }

    }
}