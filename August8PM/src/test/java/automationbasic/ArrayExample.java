package automationbasic;

public class ArrayExample {
    public static void main(String[] args) {
        int [] a = {10,12,13,14};

        for (int i = 0; i < a.length; i++ ){
            System.out.println(a[i]);

        }

        String [] name = {"Guru","Jonny","Johnson"};
        System.out.println(name[1]);
        for (int j = 0; j < name.length; j++){
            System.out.println(name[j]);
        }
    }
}
