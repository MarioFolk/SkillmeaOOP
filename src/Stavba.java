public class Stavba {
    protected float rozloha;
    protected int pocetPoschodi;
    protected int pocetOkien;

    public float vypocetCenyDomu(int lukrativnaOblast, String menoRodiny) {
        System.out.println(menoRodiny);
        float vypocet = lukrativnaOblast * (pocetOkien * 800 + rozloha * 840);
        return vypocet;
    }

}
