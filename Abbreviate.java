// great, except again:
// TODO: you have to actually make a new String
public class Abbreviate {
    public static void main(String[] args) {
        String text = args[0];
        int textLength = args[0].length();
        if(textLength >= 8){
            String first = args[0].substring(0,2);
            String second = args[0].substring(text-2,text);
            String newText = first + "..." + second;

            System.out.println(newText);
        }
        else{
            System.out.println(text);
        }
    }
}
