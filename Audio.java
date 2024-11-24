package test;

public class Audio {
    private String titulo;
    private int duração;
    private int totalDeReproduções;
    private int curtidas;
    private int classificação;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuração() {
        return duração;
    }
    public int getTotalDeReproduções() {
        return totalDeReproduções;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public int getClassificação() {
        return classificação;
    }
    public void curte(){
        this.curtidas++;
    }
    public void reproduz(){
        this.totalDeReproduções++;
    }
    
}
