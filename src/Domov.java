
public class Domov {

    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;







    public void vypocetCenyDomu(int lukrativnaOblast, String menoRodiny){
        System.out.println(lukrativnaOblast*(pocetOkien*800 + rozloha*840));

    }
}
