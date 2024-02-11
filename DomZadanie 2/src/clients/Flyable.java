package clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Flyable {
    void fly();
    default double getRunSpeed(){
        return 20;
    }

}