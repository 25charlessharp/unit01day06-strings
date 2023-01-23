public class Abbreviate {
    public static void main(String[] args) {
        int text = args[0].length();
        if(text >= 8){
            String first = args[0].substring(0,2);
            String second = args[0].substring(-2,0);

            System.out.println(first + "..." + second );
        }
        else{
            System.out.println(args[0]);
        }
    }
}
