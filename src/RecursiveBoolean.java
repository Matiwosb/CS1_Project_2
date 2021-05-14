public class RecursiveBoolean {
    public static void main(String[] args) {
        String[] array = {"Mat", "Wor","Betty"};

        int x = array.length-1;
        System.out.println(isMember(array,x));

    }
    public static boolean isMember(String[] array, int value){
        if(array[value].equals("Wor"))
            return true;
        else
            return isMember(array, value-1);
    }
}
