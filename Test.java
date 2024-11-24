package Principal;

import test.Musicas;
import test.Podcast;
import test.minhasPreferidas;

public class Test {
    public static void main(String[] args) {
        Musicas dadoMusicas = new Musicas();
        dadoMusicas.setTitulo("Maquina do tempo");
        dadoMusicas.setArtista("Matue");
        dadoMusicas.setGenero("Trap");
        dadoMusicas.setAlbum("333");
        dadoMusicas.fichaTecnica();
        
        for (int i = 0; i < 1000; i++) {
            dadoMusicas.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            dadoMusicas.curte();
        }
        dadoMusicas.getClassificação();

        Podcast dadosPodcast = new Podcast();
        dadosPodcast.setTitulo("PodPah");
        dadosPodcast.setHost("Igão ");
        dadosPodcast.setDescricao("eu e mitico falamos muita merda hahah");

        for (int i = 0; i < 5000; i++) {
           dadosPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            dadosPodcast.curte();
        }
        minhasPreferidas preferidas = new minhasPreferidas();
        preferidas.inclui(dadosPodcast);
        preferidas.inclui(dadoMusicas);


       
    }

}
