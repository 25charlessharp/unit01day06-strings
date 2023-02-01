
public class Abbreviate {
    public static void main(String[] args) {
        String text = args[0];
        int textLength = args[0].length();
        if(textLength >= 8){
            String first = text.substring(0,2);
            String second = text.substring(textLength-2,textLength);
            String newText = first + "..." + second;

            System.out.println(newText);
        }
        else{
            System.out.println(text);
        }
    }
}
