public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        System.out.println("int has a width of 32. Range is " + myMinValue + "\t<---->\t" + myMaxValue + "\n");

        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("byte has a width of 8 " + myByteValue);
        System.out.println("Result of the division of byte values is " + myNewByteValue + "\n");

        short myShortValue = 32767;
        System.out.println("short  has a width of 16 " + myShortValue + "\n");

        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        System.out.println("long  has a width of 64. Range is " + myMinLongValue + "\t<---->\t" + myMaxLongValue + "\n");


        //Zadanie
        byte byteValue = 25;
        short shortValue = 767;
        int intValue = 2_000_000;
        long myTotalLongValue = (long) (50_000 + 10 * (byteValue + shortValue + intValue));

        System.out.println("long total : " + myTotalLongValue);
    }
}
