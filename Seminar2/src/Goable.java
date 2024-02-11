import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {
    //public static  final List<Integer> pi = new ArrayList<>();
    void go();
    default double getRunSpeed(){
        return 10;
    }

}