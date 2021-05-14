public class Recursion {
    public static void main(String[] args) {
        String[] array = {"John", "Tity"};
        if (isMember(array,"Michel"))
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
    }
    public static boolean isMember(String[] array, String name){
        int i = array.length;
        if (array.length==0)
            return false;
        if (array[i-1].equals(name))
            return true;
        else {
            String[] array2 = new String[array.length-1];
            for (int j = 0;j < array.length-1;j++){
                array2[j] = array[j];
            }
            return isMember(array2, name);
        }
    }
}
