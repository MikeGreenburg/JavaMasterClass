public class PrimitiveTypesChallenges {

    public static void main(String[] args){

        byte myByte = 1;

        short myShort = 22;

        int myInt = 43;

        long myLong = 50000 + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal); //Integers are the best data type for using digits in Java
    }
}
