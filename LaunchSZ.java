import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
    // public void disp() {
    // System.out.println(name);
    // System.out.println(age);
    // System.out.println(runs);
    // }

}

public class LaunchSZ {
    public static void main(String[] args) throws IOException {
        System.out.println("Begin...");
        Cricketer c = new Cricketer("Rohit", 20, 300000);
        // c.disp();

        // File f = new File("Ar.txt");
        // f.createNewFile();
        FileOutputStream fos = new FileOutputStream("Ar.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        // oos.writeObject(c1);

        oos.flush();
        oos.close();

        // PROGRAM FOR DESERIALIZATION OF THE DATA

        // FileInputStream fis = new FileInputStream("Ar.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);
        // ObjectInputStream ois = new ObjectInputStream(bis);

        // Cricketer cr = (Cricketer) ois.readObject();
        // cr.disp();

        // ois.close();

    }
}
