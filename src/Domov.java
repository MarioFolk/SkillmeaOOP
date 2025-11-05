
public class Domov {

    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;







    public float vypocetCenyDomu(int lukrativnaOblast, String menoRodiny){
        System.out.println(menoRodiny);
        float vypocet = lukrativnaOblast*(pocetOkien*800 + rozloha*840);
        return vypocet;
    }
}
