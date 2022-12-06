package Exercise1;

//Below is a problem statement
//The parameter weekday is true if it is a weekday and the parameter vacation is true if we are on vacation.
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public class Example1 {

    public boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Example1 obj = new Example1();
        System.out.println(obj.sleepIn(true, false));
        System.out.println(obj.sleepIn(false, true));
        System.out.println(obj.sleepIn(true, true));
        System.out.println(obj.sleepIn(false, false));
    }
}
