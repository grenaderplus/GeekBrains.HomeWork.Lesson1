package GeekBrains.HomeWork.Lesson1.HomeWork;

public class Lesson1 {

    public static void main(String[] args) {

        System.out.println("Привет!\nЭто домашнее задание по первому уроку курса JavaCore.Базовый уровень");

/*        byte b = 55;
        System.out.println(b);

        short s = 666;
        System.out.println(s);

        int i = 1991;
        System.out.println(i);

        long l = 23999654L;
        System.out.println(l);

        float f = 3.24765424563457357347F;
        System.out.println(f);

        double d = 55.1248912591347913847;
        System.out.println(d);

        boolean bool = true;
        System.out.println(bool);

        char c = 'g';
        System.out.println(c);

        String o = "greetings";
        System.out.println(o);
*/
        System.out.println(someMath(10, 5, 8, 4));
        System.out.println(isSummFits(5, 5));
        isNegative(999);
        System.out.println(negativeNumber(-10));
        printPhrase("Alexander");
        isLeap(2020);

        System.out.println("Домашнее задание выполнено.");


    }

    static int someMath(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean isSummFits(int a, int b) {
        return (10 <= (a + b) && (a + b) <= 20);
    }

    static void isNegative(int a) {
        if (a < 0) {
            System.out.println("Число " + a + " отрицательное");
        } else {
            System.out.println("Число " + a + " положительное");
        }
    }

    static boolean negativeNumber(int a) {
        return a < 0;
    }

    static void printPhrase(String phrase) {
        System.out.println("Привет, " + phrase);
    }

    static void isLeap(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("Год " + a + " високосный.");
        } else {
            System.out.println("Год " + a + " не високосный.");
        }
        }
    }
