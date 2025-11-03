//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Domov domNovakov = new Domov();
        domNovakov.pocetOkien = 12;
        domNovakov.pocetPoschodi = 3;
        domNovakov.rozloha = 421.5f;

        Domov domZajacov = new Domov();
        domZajacov.pocetOkien = 24;
        domZajacov.pocetPoschodi = 2;
        domZajacov.rozloha = 853.6f;

        //System.out.println(domZajacov.rozloha + domNovakov.rozloha);
        domNovakov.vypocetCenyDomu();
        domZajacov.vypocetCenyDomu();

    }
}