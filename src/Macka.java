public class Macka extends Zviera{
    private int pocetUlovenychRyb;

    Macka(String rasa, float hmotnost, boolean jeSamec, int pocetUlovenychRyb) {
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.jeSamec = jeSamec;
        this.pocetUlovenychRyb = pocetUlovenychRyb;
    }

    @Override
    public void vydajZvuk(){
        System.out.println("Mnau mnau");
    }
}