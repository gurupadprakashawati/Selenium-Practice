package automationbasic;

public class LocalVariableGlobal {

    static int a = 1;
    public static void main(String[] args) {

        System.out.println(a);
    }

    public void m1(){
        System.out.println(a);
    }
}
