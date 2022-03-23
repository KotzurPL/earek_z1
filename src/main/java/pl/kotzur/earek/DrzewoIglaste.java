package pl.kotzur.earek;

public class DrzewoIglaste extends Drzewo {
    
    private int liczbaIgiel;

    public DrzewoIglaste() {
        super();
        this.liczbaIgiel = 0;
    }

    public DrzewoIglaste(double srednicaPnia, int liczbaGalezi, int liczbaIgiel) {
        super(srednicaPnia, liczbaGalezi);
        this.liczbaIgiel = liczbaIgiel >= 0 ? liczbaIgiel : 0;
    }
    
    @Override
    public void rosnij() {
        super.rosnij();
        if (liczbaIgiel < 105) {
            liczbaIgiel += 50;
        } else {
            liczbaIgiel = (int) (liczbaIgiel * 1.2);
        }
    }
    
}
