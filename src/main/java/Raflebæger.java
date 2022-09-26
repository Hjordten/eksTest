import java.util.Arrays;
import java.util.Random;

public class Raflebæger {

    private int antalTerninger; //attribut
    private int[] terninger;

    public Raflebæger(int antalTerninger){ //konstruktør
        this.antalTerninger = antalTerninger; //definere at antalterninger er lig med antalgerninger. Ellers ved den ikke, hvad for en attribut, den hører til.
        terninger = new int[antalTerninger];
    }

    public int ryst(){
        //lave tilfældigt tal ml 1-6
        Random random = new Random(); //random generator


        int sum = 0;
        //loope svarende til antalterninger
        for(int i = 0; i < antalTerninger; i++ ) {
            int randomNumber = random.nextInt(6) + 1;
            //læg i array
            terninger[i] = randomNumber;
            //summere og returnere smalet værdi
            sum += randomNumber;
        }
        //simulere ryst med to "terninger"
        return sum;
    }

    public int[] se() {
        return terninger;
    }
}
