//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Domov domNovakov = new Domov(536f, 10, 3);
        Domov domZajacov = new Domov(423f, 8, 2);
        Domov domKralikov = new Domov(356f, 6, 4);

        //System.out.println(domZajacov.rozloha + domNovakov.rozloha);
        float cenaDomuNovakov = domNovakov.vypocetCenyDomu(1, "Novakova");
        float cenaDomuZajacov = domZajacov.vypocetCenyDomu(3, "Zajacova");
        float cenaDomuKralikov = domKralikov.vypocetCenyDomu(2, "Kralikova");

        domNovakov.setPocetOkien(8);
        int pocetOkienNovakov = domNovakov.getPocetOkien();
        System.out.println(pocetOkienNovakov);

        System.out.println(cenaDomuZajacov + cenaDomuNovakov);
    }
}