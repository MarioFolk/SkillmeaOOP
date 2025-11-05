
public class Domov {

    //Toto su vlastnosti
    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(){
        System.out.println("Toto sa zavola pri vytvoreni noveho objektu");
    }

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativnaOblast, String menoRodiny){
        System.out.println(menoRodiny);
        float vypocet = lukrativnaOblast*(pocetOkien*800 + rozloha*840);
        return vypocet;
    }
}

