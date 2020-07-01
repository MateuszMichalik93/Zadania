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

    public void avgTab(){
        int[] tablica = {1, 2, 3, 4, 5};
        double avgTab = 0;

        avgTab = sum / tablica.length;

        System.out.println(avgTab);
        }

        public void maxLiczba(){
            int[] tablica = {1, 2, 3, 4, 5};
            int maxLiczba = tablica[0];

             for (int i = 0; i < tablica.length; i++){
             if(tablica[i] > maxLiczba){
                 maxLiczba = tablica[i];
             }
             }
            System.out.println(maxLiczba);
        }

        public void minLiczba(){
            int[] tablica = {1, 2, 3, 4, 5};
            int minLiczba = tablica[0];
            for (int i = 0; i < tablica.length; i++){
                if(minLiczba > tablica[i]){
                    minLiczba = tablica[i];
                }
            }
            System.out.println(minLiczba);

        }

    public static void main(String[] args) {
        ZadaniaTablice zadaniaTablice = new ZadaniaTablice();
        zadaniaTablice.sumTab();
       zadaniaTablice.avgTab();
       zadaniaTablice.maxLiczba();
       zadaniaTablice.minLiczba();
    }
}
