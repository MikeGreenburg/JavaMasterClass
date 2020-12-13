public class PrimitiveTypesChallenges {

    public static void main(String[] args){

        byte myByte = 1;

        short myShort = 22;

        int myInt = 43;

        long myLong = 50000 + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
