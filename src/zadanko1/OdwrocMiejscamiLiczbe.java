package zadanko1;

public class OdwrocMiejscamiLiczbe {

    public void odwrcLiczbe(){
        int liczba = 12345;

        while(liczba > 0){

            System.out.print( liczba %10);
            liczba = liczba /10;
        }
    }

    public static void main(String[] args) {
        OdwrocMiejscamiLiczbe odwrocMiejscamiLiczbe = new OdwrocMiejscamiLiczbe();
        odwrocMiejscamiLiczbe.odwrcLiczbe();
    }
}
