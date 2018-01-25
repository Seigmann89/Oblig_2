import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Serie galactica = new Serie("Battlestar Galactica", "When an old enemy, the Cylons, resurface and obliterate the 12 colonies," + "\n" + "the crew of the aged Galactica protect a small civilian fleet - the last of humanity..", LocalDate.of(2005, 1, 14));


        //Episode thirtythree = new Episode(1, 1, "33", 42);
        //Episode water = new Episode(1, 2, "Water", 42);
        Episode water = new Episode(1, 1, "Water", 42);

        //galactica.leggTilEpisode(thirtythree);
        //galactica.leggTilEpisode(water);


        galactica.lagSesonger(5, 20);


        System.out.println(galactica.toString());
        galactica.leggTilEpisode(water);

        //Henter alle episoder
        System.out.println("\n" + "-----------------------" + "\n");
        galactica.hentAlleEpisoder();
        System.out.println("\n" + "-----------------------" + "\n");


        //Henter alle episoder i sesong 4
        galactica.hentAlleEpisoder(4);

        System.out.println("\n" + "-----------------------" + "\n");

        //Antall episoder
        galactica.antallEpisoder();

    }
}