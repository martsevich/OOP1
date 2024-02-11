package clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Swimable {
    void go();
    default double getRunSpeed(){
        return 15;
    }

}
