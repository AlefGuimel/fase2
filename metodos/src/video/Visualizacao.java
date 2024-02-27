package video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filmes;

    public Visualizacao(Gafanhoto espectador, Video filmes){
        this.espectador = espectador;
        this.filmes = filmes;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filmes.setViews(this.filmes.getViews() + 1);
    }

    public Gafanhoto getEspectador(){
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador){
        this.espectador=espectador;
    }

    public Video getFilmes(){
        return filmes;
    }
    public void setFilmes(Video filmes){
        this.filmes=filmes;
    }

    @Override
    public String toString(){
        return "Espectador: " + getEspectador() + ", Filme: " + filmes;
    }

}
