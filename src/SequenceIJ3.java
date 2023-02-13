public class SequenceIJ3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;

        for (int k = 1; k <= 20; k++) {
            if (k == 4 || k == 8 || k == 12 || k == 16 || k == 20){
                i += 2;
                j += 5;
            }else {
                System.out.println("I=" + i + " J=" + j);
                j -= 1;
            }
        }
    }
}
