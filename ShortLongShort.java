// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class ShortLongShort {
    public static void main(String[] args) {
        if(args[0].length() < args[1].length()){
            System.out.println(args[0] + args[1] + args[0]);
        }
        else{
            System.out.println(args[1] + args[0] + args[1]);
        }

    }
}
