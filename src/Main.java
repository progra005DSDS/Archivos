import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        LeerArchivoTxt();
    }

    public static void LeerArchivoTxt() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("C:/Users/lenovo/IdeaProjects/Archivos/ola.txt");
            fr = new FileReader(archivo, Charset.forName("UTF-8"));
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null)
                System.out.println(linea);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}