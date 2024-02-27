package muitasformas;

public class Main {
    public static void main(String[] args) {
        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35);
        m.setIdade(12);
        m.setMembros(4);
        System.out.println(m.toString());
        m.alimentar();
        a.locomover();
        r.emitirSom();*/

        Canguru c = new Canguru();
        Cachorro h = new Cachorro();
        Cobra b = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();


        h.locomover();
        h.setIdade(8);
        h.setPeso(23);
        h.setMembros(4);
        h.alimentar();
        h.emitirSom();


        c.locomover();
        c.usarBolsa();


        b.locomover();

        e.locomover();
;



    }
}
