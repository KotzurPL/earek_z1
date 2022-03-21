package pl.kotzur.earek;

public class Drzewo {
    
    private double srednicaPnia;
    private int liczbaGalezi;

    public Drzewo() {
        srednicaPnia = 0.0;
        liczbaGalezi = 0;
    }

    public Drzewo(double srednicaPnia, int liczbaGalezi) {
        this.srednicaPnia = srednicaPnia >= 0.0 ? srednicaPnia : 0.0;
        this.liczbaGalezi = liczbaGalezi >= 0 ? liczbaGalezi : 0;
    }
    
    public void rosnij() {
        if (srednicaPnia < 0.01) {
            srednicaPnia += 0.001;
        } else {
            srednicaPnia *= 1.05;
        }
        if (liczbaGalezi < 20) {
            liczbaGalezi += 2;
        } else {
            liczbaGalezi = (int) (liczbaGalezi * 1.1);
        }
    }

    public double getSrednicaPnia() {
        return srednicaPnia;
    }

    public void setSrednicaPnia(double srednicaPnia) {
        this.srednicaPnia = srednicaPnia >= 0.0 ? srednicaPnia : 0.0;
    }

    public int getLiczbaGalezi() {
        return liczbaGalezi;
    }

    public void setLiczbaGalezi(int liczbaGalezi) {
        this.liczbaGalezi = liczbaGalezi >= 0 ? liczbaGalezi : 0;
    }
    
    
    
}
