public class Lesson2 {
    public static void main(String[] args) {
        // char
        char varChar;
        varChar = 'B';
        System.out.println(varChar);

        // String
        String name = "Adrian";
        System.out.println(name);

        // boolean
        boolean isTrue = false;
        if (isTrue) {
            System.out.println("Prawda");
        }

        // byte
        byte varByte = Byte.MIN_VALUE; //klasa osłonowa
        byte varByte2 = Byte.MAX_VALUE; //klasa osłonowa

        System.out.println("byte" + varByte + " " + varByte2);

        // short
        short varShort = Short.MIN_VALUE;
        short varShort2 = Short.MAX_VALUE;
        System.out.println("short:" + varShort + " " + varShort);

        // int
        int varInt = Integer.MIN_VALUE;
        int varInt2 = Integer.MAX_VALUE;
        System.out.println("int:" + varInt + " " + varInt2);

        // long
        long varLong = Long.MIN_VALUE;
        long varLong2 = Long.MAX_VALUE;
        System.out.println("long:" + varLong + " " + varLong2);

        // float
        float varFloat = Float.MIN_VALUE;
        float varFloat2 = Float.MAX_VALUE;
        float varFloatCorrect = 27.55f; //f wskazuje że to float
        System.out.println("float:" + varFloat + " " + varFloat2);

        // double (większa precyzja niż float)
        double varDouble = Float.MIN_VALUE;
        double varDouble2 = Float.MAX_VALUE;
        System.out.println("double:" + varDouble + " " + varDouble2);

        final int CONST = 17; // stała
        System.out.println("Stała:" + CONST);
    }
}
