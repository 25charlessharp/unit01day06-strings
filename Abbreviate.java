public class Abbreviate {
    public static void main(String[] args) {
        int text = args[0].length();
        if(text >= 8){
            String first = args[0].substring(0,2);
            String second = args[0].substring(text-2,text);

            System.out.println(first + "..." + second );
        }
        else{
            System.out.println(args[0]);
        }
    }
}
