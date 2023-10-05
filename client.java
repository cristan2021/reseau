
/*CLIENT CLASS*/
import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String args[]) throws Exception {

        // Scanner myObj = new Scanner(System.in); // Create a Scanner object
        // System.out.println(""entrer le nom du fichier");
        // String fichier= myObj.nextLine(); // fichier
        // System.out.println(""entrer le port");
        // int port= myObj.nextInt(); // fichier

        byte b[] = new byte[135000];

        FileInputStream f = new FileInputStream("gh.txt");
        DatagramSocket dsoc = new DatagramSocket(500);

        int i = 0;
        while (f.available() != 0) {
            b[i] = (byte) f.read();
            i++;
        }
        f.close();
        dsoc.send(new DatagramPacket(b, i, InetAddress.getByName("172.31.18.64"), 20002));
    }

}
