package A_dummy;

public class A_object {
    public String firtsName = "Naresh";

    public static void main(String[] args) {
        A_object obj = new A_object();
//        System.out.println(obj);
        System.out.println(obj.firtsName);
//        A_object obj2 = new A_object();

        obj.firtsName = "Hello";
        System.out.println(obj.firtsName);

//        obj2.firtsName = "Hello";
//        System.out.println(obj2.firtsName);


    }

}

class Two extends A_object {
    public static void main(String[] args) {
        A_object obj = new A_object();
        System.out.println("hii");
        System.out.println(obj.firtsName);
    }
}


class type_casting {
    public static void main(String[] args) {
        int a =4;
        Integer b = a;

        float c = 3.3f;
        Float d = c;

    }
}
