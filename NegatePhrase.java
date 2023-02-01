
public class NegatePhrase {
    public static void main(String[] args) {
        String text = args[0];
        String not = args[0].substring(0,3);
        if(not.equals("not")){
            System.out.println(text);
        }
        else{
            String newText = "not "+ text;
            System.out.println(newText);
        }

    }
}
