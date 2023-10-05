public

/*SERVER CLASS*/
import java.net.*;
import java.io.*;

public class Serveur2{
    public static void main(String args[]) throws IOException {
        byte b[] = new byte[66000];
        DatagramSocket dsoc = new DatagramSocket(20000);
        FileOutputStream f = new FileOutputStream("essai.txt");
        while (true) {
            DatagramPacket dp = new DatagramPacket(b, b.length);
            dsoc.receive(dp);
            f.write(b, 0, dp.getLength());
            f.write(dp.getLength());
            System.out.println("de taille"+dp.getLength());

        }
    }
}{

}
