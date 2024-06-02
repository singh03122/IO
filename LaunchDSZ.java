import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
    private String name;
    transient int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    // for DESERIALIZATION
    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

}

public class LaunchDSZ {
    public static void main(String[] args) throws Exception {
        System.out.println("Begin...");

        // PROGRAM FOR DESERIALIZATION OF THE DATA

        FileInputStream fis = new FileInputStream("Ar.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer cr = (Cricketer) ois.readObject();
        cr.disp();

        ois.close();

    }
}
