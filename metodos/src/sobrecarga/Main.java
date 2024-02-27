package sobrecarga;

public class Main {
    public static void main(String[] args) {
Cachorro x = new Cachorro();
x.reagir("toma comida");
x.reagir("Vai apanhar");
x.reagir(11,45);
x.reagir(21,45);
x.reagir(true);
x.reagir(false);
x.reagir(2,12.5);
x.reagir(17,4.5);
x.reagir(4, 6.2);




    }
}
