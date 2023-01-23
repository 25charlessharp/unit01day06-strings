public class NegatePhrase {
    public static void main(String[] args) {
        String text = args[0].substring(0,2);
        if(text == "not"){
            System.out.println(args[0]);
        }
        else{
            System.out.println("not " + args[0]);
        }

    }
}
