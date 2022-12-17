package guru.qa;

public class Main {
    public static void main(String[] args) {

        // поупражняться с математическими и логическими операторами

        byte myByte = -128;
        short myShort = 320;
        int myInteger = 10;
        long myLong = 101L;
        float myFloat = 6.3f;
        double myDouble = 9.5d;
        boolean myBoolean = true;
        char myChar = 'c';

        System.out.println(myByte + 128);
        System.out.println(myShort % 2);
        System.out.println(myInteger / 10);
        System.out.println(myLong - 1);
        System.out.println(myFloat * 2);
        System.out.println(myDouble * 3);
        System.out.println(myBoolean);
        System.out.println(myChar * 9);


        if (myInteger < 30 || myShort > 500) {
            System.out.println("Hello");
        }

        if (myInteger != 5 && myInteger > 3000 ) {
            System.out.println("Bye");
        } else {
            System.out.println("Sorry");
        }

        // добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        System.out.println(myByte + 128);
        System.out.println(myShort + 32767);
        System.out.println(myInteger * -2147483648);

        //  попробовать вычисления комбинаций типов данных (int и double)

        System.out.println(myInteger + myDouble);
        System.out.println(myInteger - myDouble);
        System.out.println(myInteger * myDouble);
        System.out.println(myInteger / myDouble);
    }
}








