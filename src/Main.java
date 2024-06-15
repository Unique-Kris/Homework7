public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int deposit = 15000;
        int month = 1;
        int total = 2_459_000;
        int money = 0;
        while (money > total); {
            month = total / deposit;
            total = deposit * month;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");}

        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {a = a + 1;
            System.out.print(a + " ");}

        System.out.println();

        int b = 11;
        for (; b > 1;) {b = b - 1;
            System.out.print(b + " ");}
        System.out.println();

        System.out.println("Задание 3");
        int population = 12_000_000;
        int diifferencePopulation = 12_000_000 / 1000;
        int birthrate = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (diifferencePopulation * (birthrate - dead));
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");}

        System.out.println("Задание 4");
        int depozit2 = 15000;
        int persent = (depozit2 * 7) / 100;
        int depozit2WithPersent = depozit2 + persent;
        int mount2 = 1;
        while (total <= 12_000_000) {
            mount2++; total = total + depozit2WithPersent;
            System.out.println("месяц " + mount2 + " сумма накоплений " + total + " рублей");}

        System.out.println("Задание 5");
        int sum = 15000;
        int persent2 = (sum * 7) / 100;
        int depozit2WithPersent2 = depozit2 + persent2;
        int mount3 = 1;
        while (sum <= 12_000_000) {
            mount3++; sum = sum + depozit2WithPersent2;
            if (mount3 % 6 == 0) {
                System.out.println("месяц " + mount3 + " сумма накоплений " + sum + " рублей");}}

        System.out.println("Задание 6");
        int depozit4 = 15000;
        int persent3 = (depozit4 * 7) / 100;
        for (int i = 1; i < 9 * 12; i++) {
            total = total + (depozit4 + persent3);
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " сумма накоплений " + total + " рублей");}
        }

        System.out.println("Задание 7");
        int friday = 5;
        for (; friday < 31; friday = friday + 7){
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");}

        System.out.println("Задание 8");
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (int year = yearBefore; year < yearAfter; year ++) {
            if (year % 79 == 0) System.out.println(year);}

    }
}