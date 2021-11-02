public class PrimitiveDataType {

    public static void main(String[] args) {

        // Byte Occupies 32 bits
        int MIN_VALUE = Integer.MIN_VALUE;
        int MAX_VALUE = Integer.MAX_VALUE;
        System.out.println("Min Int Value: " + (MIN_VALUE));
        System.out.println("Max Int Value: " + (MAX_VALUE));

        int temporary_number = 2_146_483_647;
        System.out.println(temporary_number);

        // Byte Occupies 8 bits
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte Value: " + (minByteValue));
        System.out.println("Max Byte Value: " + (maxByteValue));

        // Short Occupies 16 bits
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short Value: " + (minShortValue));
        System.out.println("Max Short Value: " + (maxShortValue));

        // Long Occupies 64 bits
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long Value: " + (minLongValue));
        System.out.println("Max Long Value: " + (maxLongValue));
        long tempLongValue = 100L; // L Suffix to determine it as long
        System.out.println(tempLongValue);
        long temporaryLongLiteralValue = 2_146_483_647_234L;
        System.out.println(temporaryLongLiteralValue);

        // Float 32 bits precision
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value: " + (minFloatValue));
        System.out.println("Max Float Value: " + (maxFloatValue));

        // Double 32 bits precision
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value: " + (minDoubleValue));
        System.out.println("Max Double Value: " + (maxDoubleValue));

        /** ******************* Casting ************************ */

        int myTotal = (MIN_VALUE / 2);
        byte myByteTotal = (byte) (minByteValue / 2);
        short myShortTotal = (short) (minShortValue/2);
        System.out.println(myTotal + " " + myByteTotal + " " + myShortTotal);

        float tempFloat = 5f/2f;
        double tempDouble = 5d/2d;
        float tempFloat2 = (float) (5f/2d);
        double tempDouble2 = 5d/2f;

        System.out.println("Float : " + tempFloat + " Double : " + tempDouble);
        System.out.println("Float 2 : " + tempFloat2+ " Double 2: " + tempDouble2);

        // Char Occupies 16 bits which also hold the unicode characters
        char ch = 'D';
        char unicodeCh = '\u0044';
        char copyrightCh = '\u00A9';
        System.out.println(ch + " " + unicodeCh + " " + copyrightCh);

        // Boolean
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println(boolTrue + " " + boolFalse);

        // String
        String s = "Sample String";
        System.out.println(s);

        String s2 = "Second String " + s;
        System.out.println(s2);

        String s3 = s + " \u00A9 2021";
        System.out.println(s3);
    }
}
