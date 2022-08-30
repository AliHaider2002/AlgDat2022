public class Oppgave2 {

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            int verdi = a[i];
            if (verdi < min) {
                min = verdi;
            }
        }
       //return min;

        int posisjon = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == min){
                posisjon = i;
            }
        }
        return posisjon;

    }

    public static void main(String[] args) {
        int [] a = {99, 2, 3, 4, 101, 6, 7, 8, 9};

        System.out.println(min(a));
       // System.out.println(posisjon(a));

    }

}