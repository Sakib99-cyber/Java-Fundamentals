public class Casting {
    public static void main(String[] args) {

        // double to int
        double theDoubleGradeAvg = 89.6;
        int theIntGradeAvg =(int) theDoubleGradeAvg;

        System.out.println("theIntGradeAvg: " + theIntGradeAvg);
        System.out.println("theDoubleGradeAvg: " +  theDoubleGradeAvg);

        // float to byte
        float theFloatGradeAvg = 89.6f;
        byte theByteGradeAvg = (byte) theFloatGradeAvg;

        System.out.println("theByteGradeAvg: " + theByteGradeAvg);
        System.out.println("theFloatGradeAvg: " + theFloatGradeAvg);

        // int to car
        int theIntegerCode = 95;
        char theCharGradeAvg = (char) theIntegerCode;

        System.out.println("theCharGradeAvg: " + theCharGradeAvg);
        System.out.println("theIntegerCode: " + theIntegerCode);

        // string to int
        int count = Integer.parseInt("89");
        System.out.println("count: " + count);
    }
}
