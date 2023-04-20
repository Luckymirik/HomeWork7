public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int save = 15000;
        int month = 0;
        while (total < 2459000) {
            total = total + save;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");

        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int countryY = 12000000;
        int fertility = 17;
        int mortality = 8;

        int year = 0;


        while (year < 10) {
            int fertilityY = countryY / 1000 * fertility;
            int mortalityY = countryY / 1000 * mortality;
            int naturalIncrease = fertilityY - mortalityY;

            year++;
            countryY = countryY + naturalIncrease;


            System.out.println("Год " + year + " , численность населения составляет " + countryY);
        }


    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 150000;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * 7;
            month++;
            System.out.println("В " + month + " месяце у Василия будет " + sum + " рублей");
        }
        System.out.println("Вася нашел реально хороший банк");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 150000;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяце у Василия будет " + sum + " рублей");
            }

        }
        System.out.println(sum + " Вася нашел реально хороший банк");
    }


    public static void task6() {
        System.out.println("Задача 6");
        int sum = 150000;
        int month = 0;
        int halfYear = 0;
        while (month < 9 * 12) {
            sum = sum + sum / 100 * 7;
            month++;


            if (month % 6 == 0) {
                halfYear++;
                System.out.println("В " + halfYear + " полугодии у Василия будет " + sum + " рублей");
            }
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday=5;
        int day;
        while(friday<31){
            day=friday;
            friday=friday+7;
            System.out.println("Сегодня пятница, "+ day +"-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year=2023;
        int beforeYear=year-200;
        int afterYear=year+100;
        int comet=79;
        int cometYear=0;
        while(cometYear<afterYear) {
            cometYear = cometYear + comet;
            if (cometYear > beforeYear&&cometYear<afterYear){
                System.out.println(cometYear);
            }
        }

    }



    }
