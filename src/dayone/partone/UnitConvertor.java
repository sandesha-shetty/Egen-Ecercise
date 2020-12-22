package dayone.partone;

public class UnitConvertor {

    //Here the feet input can be called in either int or double
    //We return -1 if the input is invalid i.e (negative numbers)

    public double feetToCenti(int feet) {
        if(feet<0){
            return -1;
        }
        System.out.println("Integer Input");
        double feetinCm = feet * 30.48;
        return feetinCm;
    }

    public double feetToCenti(double feet) {
        if(feet<0){
            return -1;
        }
        System.out.println("Double Input");
        double feetinCm = feet * 30.48;
        return feetinCm;
    }
}
