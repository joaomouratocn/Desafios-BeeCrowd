public class SequenceIJ2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;

        for (int p = 1; p <= 20; p++) {
            if (p == 4 || p == 8 || p == 12 || p == 16 || p == 20){
                i += 2;
                j = 7;
            }else {
                System.out.println("I=" + i + " J=" + j);
                j -= 1;
            }
        }
    }
}
