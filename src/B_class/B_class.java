package B_class;

public class B_class {
    void call (){
        final int val = 12;
        System.out.println(val);
    }

    public static void main(String[] args) {
        B_class obj = new B_class();

        obj.call();
    }
}

class B2_class extends B_class{

    void Hello(){
        System.out.println("hello");
    }
    B_class objp = new B_class();

}