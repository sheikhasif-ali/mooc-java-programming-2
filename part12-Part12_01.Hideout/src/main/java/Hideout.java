import java.util.ArrayList;

public class Hideout<T> {
    private T hideout;

    public Hideout() {
        this.hideout = null; 
    }

    public void putIntoHideout(T toHide) {
        hideout = toHide;
    }

    public T takeFromHideout() {
        if(!(hideout == null)) {
            T temp = hideout;
            hideout = null;
            return temp;
        } else {
            return hideout;
        }
    }

    public boolean isInHideout() {
        if(hideout == null) {
            return false;
        } else {
            return true;
        }
    }
}
