package clients;

@FunctionalInterface
public interface Goable {
    //public static  final List<Integer> pi = new ArrayList<>();
    void go();
    default double getRunSpeed(){
        return 10;
    }

}