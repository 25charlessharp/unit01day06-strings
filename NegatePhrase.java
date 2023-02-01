// good, except:
// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        String text = args[0].substring(0,3);
        if(text.equals("not")){
            System.out.println(args[0]);
        }
        else{
            System.out.println("not " + args[0]);
        }

    }
}
