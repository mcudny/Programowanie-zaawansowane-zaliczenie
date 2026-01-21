import java.io.Serializable;
import java.util.Objects;

public class Telefon implements Serializable {
    private String marka;
    private double ekran;

    public Telefon(String marka, double ekran) {
        this.marka = marka;
        this.ekran = ekran;
    }

    @Override
    public String toString() {
        return "Telefon{marka='" + marka + "', ekran=" + ekran + "\"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefon telefon = (Telefon) o;
        return Double.compare(telefon.ekran, ekran) == 0 &&
                Objects.equals(marka, telefon.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, ekran);
    }

}
