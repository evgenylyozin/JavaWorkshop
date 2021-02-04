interface Cmp {
    public String getDeviceType();
    public String getSpeed();
}

class Tbl implements Cmp {

    public String getDeviceType(){
        return "It's a tablet!";
    }

    public String getSpeed(){
        return "1GHz";
    }
}

class Computer {
    //variables
    private double cpuSpeed;

    //constructor
    Computer() {
        cpuSpeed = 0;
    }

    //methods
    void setCpuSpeed (double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed () {
        return cpuSpeed;
    }

    @Deprecated
    public void whatIsIt() {
        System.out.println("it is a PC");
    }

    public void getDeviceType() {
        System.out.println("it is a PC");
    }
}

@SuppressWarnings("deprecation")
class Tablet extends Computer {
    //variables
    private double screenSize;

    //methods
    void setScreenSize(double _screenSize) {
        screenSize = _screenSize;
    }
    double getScreenSize() {
        return screenSize;
    }

    @Override
    public void whatIsIt() {
        System.out.println("it is a tablet");
    }
}

public class ch3_1 {
    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        myTab.whatIsIt();

        Tbl otherTab = new Tbl();

        System.out.println(otherTab.getDeviceType());
        System.out.println(otherTab.getSpeed());
    }
}
