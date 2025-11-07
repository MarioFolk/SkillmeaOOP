public class Obchod extends Stavba {

    private int pocetPokladni;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladni) {
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladni = pocetPokladni;
    }

    public float vypocetCenyDomu(int lukrativnaOblast, String nazovObchodu) {
            System.out.println(nazovObchodu);
            float vypocet = lukrativnaOblast * (pocetPokladni * 800 + rozloha * 840);
            return vypocet;
        }
}
