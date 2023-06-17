
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }


    public boolean equals(Object plate) {
        if (plate == null) {
            return false;
        }

        if (plate.getClass() != this.getClass()) {
            return false;
        }

        final LicensePlate other = (LicensePlate) plate;
        if ((this.liNumber == null) ? (other.liNumber != null) : !this.liNumber.equals(other.liNumber)) {
            return false;
        }

        if (this.country != other.country) {
            return false;
        }

        return true;
    }
    

    public int hashCode() {
        int hashed = 0;
        String hash = this.liNumber+this.country;
        char[] singles;
        singles = hash.toCharArray();
        ArrayList<Integer> hasher = new ArrayList<>();
        for(char loop: singles) {
            hasher.add((int)loop);
        }

        for(int i = 0; i < hasher.size(); i++) {
            int j = 1;
            hashed = hasher.get(i)*j;
            j *= 10;
        }

        return hashed;
    }

}
