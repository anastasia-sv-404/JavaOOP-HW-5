import java.util.Arrays;
import java.util.Scanner;

public class View {
    public void printMenu() {
        System.out.println("\nКакой тип калькулятора Вы хотите использовать?\n" +
                "1 - Для рациональных чисел (числа с плавающей точкой)\n" +
                "2 - Для комплексных чисел\n");
    }

    public int checkMenuItem() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер пункта меню:\n");
            boolean flag = scanner.hasNextInt();
            if (!flag) {
                System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            } else {
                int num = scanner.nextInt();
                if (num == 1 || num == 2) {
                    return num;
                } else {
                    System.out.println("Выберете один из двух типов калькуляторов.");
                }
            }
        }
    }

    public double checkDoubleNumber() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean flag = scanner.hasNextDouble();
            if (!flag) {
                System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            } else {
                double num = scanner.nextDouble();
                return num;
            }
        }
    }

    public void insertDoubleNumber() {
        System.out.println("Введите число: ");
    }

    public void insertReComplexPart() {
        System.out.println("Введите действительную часть числа: ");
    }

    public void insertImComplexPart() {
        System.out.println("Введите мнимую часть числа: ");
    }


    public String checkOperation() {
        String[] operations = new String[]{"+", "-", "/", "*"};
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите операцию: ");
            String oper = scanner.nextLine();
            if (Arrays.asList(operations).contains(oper)) {
                return oper;
            } else {
                System.out.println("Вводите одну из следующих операций: '+', '-', '/', '*' .");
            }
        }
    }

    public int anotherAction() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nЖелаете продолжить? (1 - да, любое другое число - нет): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели неверное значение. Попробуйте еще раз.");
            } else {
                int answer = scanner.nextInt();
                return answer;
            }
        }
    }
}
