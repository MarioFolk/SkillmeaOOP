public class Domov extends Stavba {

    //Toto su vlastnosti
    private String material;
    private boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float roz, int pocOkien, int pocPoschodi){
        rozloha = roz;
        pocetOkien = pocOkien;
        pocetPoschodi = pocPoschodi;
        //System.out.println("Toto sa zavola pri vytvoreni noveho objektu");
    }

    //Getter pre ziskanie dat v private fields
    public int getPocetOkien(){
        return pocetOkien;
    }

    //Setter pre prepis dat v private fields
    public void setPocetOkien(int novyPocetOkien) {
        pocetOkien = novyPocetOkien;
    }
}

