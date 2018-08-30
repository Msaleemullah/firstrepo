package singleton;

public class Automobile {
    static Automobile automobile = new Automobile();
    private Automobile() {

    }

    public static Automobile getVehicle () {
        return automobile;
    }

}
