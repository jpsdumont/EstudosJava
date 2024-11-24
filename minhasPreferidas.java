package test;

public class minhasPreferidas {
    public void inclui( Audio audio){
        if (audio.getClassificação() >= 9) {
            System.out.println(audio.getTitulo() + "É considerada um sucesso absoluto" +
            "e preferido por todos!");
        }else{
            System.out.println(audio.getTitulo() + "Tambem é um que muitas pessoas estão curtindo! ");
        }
    }

}
