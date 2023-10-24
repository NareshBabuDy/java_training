package method;

import java.util.Scanner;

public class C_method       {
    Scanner sc = new Scanner(System.in);
    void Add(){
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of a & b "+ (a+b));
    }

    void Add(int a, int b){
        int c = a+b;
        System.out.println("Sum of a & b "+ c);
    }
    public static void main(String[] args) {
        C_method obj = new C_method();
        //Without parameter passing it will call the First add method
        obj.Add();

        //With parameter passing it will call the Second Add method
        System.out.println("call method by the parameter");
        obj.Add(12,12);

    }

}
