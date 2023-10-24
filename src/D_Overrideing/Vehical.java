package D_Overrideing;

public class Vehical {
    Vehical(){
        System.out.println("default");
    }
    int Vehical(int a){
        return a;
    }
    private int wheels = 4;

    void wheels() {
        System.out.println(wheels);
    }
    void color(){
        System.out.println("Blue");
    }


}
