
public class Domov {

    float rozloha;
    int pocetOkien;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    public void vypocetCenyDomu(){
        System.out.println(pocetOkien*800 + rozloha*840);

    }
}
