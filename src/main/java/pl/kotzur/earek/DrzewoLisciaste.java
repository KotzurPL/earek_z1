package pl.kotzur.earek;

public class DrzewoLisciaste extends Drzewo {
    
    private int liczbaLisci;

    public DrzewoLisciaste() {
        super();
        this.liczbaLisci = 0;
    }

    public DrzewoLisciaste(double srednicaPnia, int liczbaGalezi, int liczbaLisci) {
        super(srednicaPnia, liczbaGalezi);
        this.liczbaLisci = liczbaLisci >= 0 ? liczbaLisci : 0;
    }
    
    @Override
    public void rosnij() {
        super.rosnij();
        if (liczbaLisci < 105) {
            liczbaLisci += 50;
        } else {
            liczbaLisci = (int) (liczbaLisci * 1.2);
        }
    }
    
    public void zrzucLiscie() {
        liczbaLisci = 0;
    }
}
