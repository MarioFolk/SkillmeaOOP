public class Pes {
    private String rasa;
    private float hmotnost;
    private boolean jeSamec;
    private int pocetUlovenychMaciek;

    Pes(String rasa, float hmotnost, boolean jeSamec, int pocetUlovenychMaciek){
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.jeSamec = jeSamec;
        this.pocetUlovenychMaciek = pocetUlovenychMaciek;
    }

    public void vydajZvuk(){
        System.out.println("Haf haf");
    }
}
