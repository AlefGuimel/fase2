package video;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jibileu", 20, "m", "123");
        g[1] = new Gafanhoto("Jose", 12, "m", "jesus");
        g[2] = new Gafanhoto("Josineia", 45, "f", "filhos");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[1] = new Visualizacao(g[0], v[0]);

        System.out.println(vis[1].toString());
        /*
        System.out.println(g[0].toString());
        System.out.println(v[2].toString());

         */
        }

}
