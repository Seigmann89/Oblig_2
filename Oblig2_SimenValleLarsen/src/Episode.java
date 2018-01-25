import java.util.Random;

public class Episode {
    private int sesongNummer;
    private int episodeNummer;
    private String tittelEpisode;
    private int spilleTid;


    public Episode(){
        this.sesongNummer = 1;
        this.episodeNummer = 1;
        this.tittelEpisode = "Tittel";
        this.spilleTid = new Random().nextInt((30 - 20) + 1) + 20;
    }

    public Episode(int sesongNummer) {
        this.sesongNummer = sesongNummer;
        this.episodeNummer = 1;
        this.tittelEpisode = "Tittel";
        this.spilleTid = new Random().nextInt((30 - 20) + 1) + 20;
    }

    public Episode(int sesongNummer, int episodeNummer) {
        this.sesongNummer = sesongNummer;
        this.episodeNummer = episodeNummer;
        this.tittelEpisode = "Tittel";
        this.spilleTid = new Random().nextInt((30 - 20) + 1) + 20;
    }

    public Episode(int sesongNummer, int episodeNummer, String tittelEpisode, int spilleTid) {
        this.sesongNummer = sesongNummer;
        this.episodeNummer = episodeNummer;
        this.tittelEpisode = tittelEpisode;
        this.spilleTid = new Random().nextInt((30 - 20) + 1) + 20;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    public String getTittelEpisode() {
        return tittelEpisode;
    }

    public int getSpilleTid() {
        return spilleTid;
    }

    @Override
    public String toString() {
        return  getTittelEpisode() + " - " + "S" + (sesongNummer < 10 ? "0" + sesongNummer : sesongNummer) + "E" + (episodeNummer < 10 ? + episodeNummer : episodeNummer) + " - " + getSpilleTid() + " min";
    }
}
