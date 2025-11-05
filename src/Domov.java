
public class Domov {

    //Toto su vlastnosti
    private float rozloha;
    private int pocetOkien;
    private String material;
    private int pocetPoschodi;
    private boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float roz, int pocOkien, int pocPoschodi){
        rozloha = roz;
        pocetOkien = pocOkien;
        pocetPoschodi = pocPoschodi;
        //System.out.println("Toto sa zavola pri vytvoreni noveho objektu");
    }

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativnaOblast, String menoRodiny){
        System.out.println(menoRodiny);
        float vypocet = lukrativnaOblast*(pocetOkien*800 + rozloha*840);
        return vypocet;
    }
}

