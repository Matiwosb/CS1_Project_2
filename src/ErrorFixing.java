public class ErrorFixing {
    public static void main(String[] args) {
        /*int[] table = new int[10];
        for(int x = 1;x<10;x++){
            table[x]=99;
        }*/
        String [] names={"Joe", "Maryam"};
        int totalLength = 0;

        for(int i=0;i < 2;i++) {
            totalLength += names[i].length();
        }
    }
}
