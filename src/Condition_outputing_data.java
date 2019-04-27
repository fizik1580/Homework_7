import java.util.Scanner;

public class Condition_outputing_data {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

                //Constant declaration

        double t = 0;
        double x = 10;
        double y = 30;
        double z = 55.5;

        //Input part

        try {

            System.out.print("Введите число для сравнения с константами зашитыми в данной программе: ");
            t = in.nextDouble();
        }
        catch (java.util.InputMismatchException e){

            System.out.println("Ошибочный ввод: введите действительное число формата n,m");
        }
                //Data processing

        if (t == x)
            System.out.println("Данное значение имеется в константе X = " + x);
        else if (t == y)
            System.out.println("Данное значение имеется в константе Z = " + y);
        else if (t == z)
            System.out.println("Данное значение имеется в константе Z = " + z);
        else
            System.out.println("Такой константы нет!");
    }
}
