package zadanko2;

public class ZadaniaTablice {

    int[] tablica = {1, 2, 3, 4, 5};
    int sum;
    public void sumTab(){
        for (int i = 0; i < tablica.length; i++) {
          sum += tablica[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ZadaniaTablice zadaniaTablice = new ZadaniaTablice();
        zadaniaTablice.sumTab();
    }
}
