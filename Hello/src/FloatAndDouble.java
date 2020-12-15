public class FloatAndDouble {

    public static void main(String[]args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;// adding a f at the end is also allowed (5f) if using literal numbers by default a floating point number (5.25) is recognized as a double so it must be written as 5.25f to be a float or put (float) 5.25;
        double myDoubleValue = 5;// adding a d at the end is also allowed (5d) if using literal numbers. Doubles are the preferred floating point number**




    }
}
