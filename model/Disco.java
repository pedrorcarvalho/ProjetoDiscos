package model;

public class Disco {
    private int id;
    private String titulo;
    private String artista;
    private int anoLancamento;
    private String gravadora;
    private int qtdTracks;

    public Disco(String titulo, String artista, int anoLancamento, String gravadora, int qtdTracks) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.gravadora = gravadora;
        this.qtdTracks = qtdTracks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public int getQtdTracks() {
        return qtdTracks;
    }

    public void setQtdTracks(int qtdTracks) {
        this.qtdTracks = qtdTracks;
    }
}
