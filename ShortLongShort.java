public class ShortLongShort {
    public static void main(String[] args) {
        String shorter = args[0];
        String longer = args[1];





        if(shorter.length() < longer.length()){
            String sls = shorter + longer + shorter;
            System.out.println(sls);
        }
        else{
            String sls = longer + shorter + longer;
            System.out.println(sls);
        }

    }
}
