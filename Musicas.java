package test;

public class Musicas  extends Audio{
    private String artista;
    private String album;
    private String genero;
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void fichaTecnica() {
        System.out.println(String.format("""
                A música do cantor(a) %s foi uma das mais escutadas do momento!
                Ela, que é do gênero %s e do álbum %s, é a sensação do momento!
                """, artista, genero, album));
    }
    @Override
    public int getClassificação() {
       if(this.getTotalDeReproduções() > 1000){
        return 10;
       }else{
        return 8;
       }
    }
       
}
    
