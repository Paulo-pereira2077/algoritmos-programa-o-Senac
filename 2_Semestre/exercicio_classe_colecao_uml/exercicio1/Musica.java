public class Musica {

    private String nome;
    private String artista;
    private String codYoutube;

    public Musica(String nome, String artista, String codYoutube) {
        this.nome = nome;
        this.artista = artista;
        this.codYoutube = codYoutube;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getCodYoutube() {
        return codYoutube;
    }
}
