import java.time.LocalDate;
import java.util.ArrayList;

public class Serie {
    private String tittelSerie;
    private String beskrivelse;
    private LocalDate utgivelse;
    private ArrayList<Episode> sesongListe = new ArrayList<Episode>();
    private int gjennomSnittligSpilletid;
    private int antallSesonger;
    private int antallEpisoder;


    public Serie() {
        this.tittelSerie = "Tittel";
        this.beskrivelse = "Beskrivelse";
        this.utgivelse = LocalDate.now();
        this.sesongListe = new ArrayList<Episode>();
    }

    public Serie(String tittelSerie, String beskrivelse, LocalDate utgivelse) {
        this.tittelSerie = tittelSerie;
        this.beskrivelse = beskrivelse;
        this.utgivelse = utgivelse;
        this.sesongListe = new ArrayList<Episode>();
    }


    public void leggTilEpisode(Episode nyEpisode) {
        if ((nyEpisode.getSesongNummer()) > (this.antallSesonger + 1)) {
            System.out.println("Det skjedde en feil.");
        } else {
            this.sesongListe.add(nyEpisode);
            this.antallSesonger = nyEpisode.getSesongNummer();
            oppdaterGjennomSnittligSpilletid();
        }
    }

    public void hentAlleEpisoder(int sesong) {
        for (int i = 0; i < this.sesongListe.size(); i++) {
            if (this.sesongListe.get(i).getSesongNummer() == sesong) {
                System.out.println(this.sesongListe.get(i));
            }
        }
    }

    public void hentAlleEpisoder() {
        for (int i = 0; i < this.sesongListe.size(); i++) {
            hentAlleEpisoder(i);
        }
    }

    public void lagSesonger(int sesongerAntall, int episoderAntall) {
        for (int i = 1; i < (sesongerAntall + 1); i++) {
            for (int j = 1; j < (episoderAntall + 1); j++) {
                this.leggTilEpisode(new Episode(i, j));
            }
        }
    }

    public int henteTotalTid() {
        int totalTid = 0;

        for (int i = 0; i < this.sesongListe.size(); i++) {
            totalTid += this.sesongListe.get(i).getSpilleTid();
        }
        return totalTid;
    }

    public void oppdaterGjennomSnittligSpilletid() {
        gjennomSnittligSpilletid = this.henteTotalTid() / this.sesongListe.size();
    }

    public void antallEpisoder() {
        int antEpisoder = 0;

        for (int i = 0; i < sesongListe.size(); i++) {
            antEpisoder += sesongListe.get(i).getEpisodeNummer();

        }
        System.out.println("Det er tilsammen: " + antEpisoder + " episoder");
    }

    //Getter

    public String getTittelSerie() {
        return tittelSerie;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getUtgivelse() {
        return utgivelse;
    }

    public ArrayList<Episode> getSesongListe() {
        return sesongListe;
    }

    private int getGjennomSnittligSpilletid() {
        return gjennomSnittligSpilletid;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }

    public int getAntallEpisoder() {
        return antallEpisoder;
    }
    //Setter


    public void setTittelSerie(String tittelSerie) {
        this.tittelSerie = tittelSerie;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setUtgivelse(LocalDate utgivelse) {
        this.utgivelse = utgivelse;
    }

    public void setSesongListe(ArrayList<Episode> sesongListe) {
        this.sesongListe = sesongListe;
    }

    @Override
    public String toString() {
        return getTittelSerie() + " - " + getUtgivelse() + "\n" + getBeskrivelse() + "\n";
    }
}