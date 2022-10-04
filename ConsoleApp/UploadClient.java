import java.io.*;
import java.net.*;

public class UploadClient {
    public UploadClient() {
    }

    public String uploadFile() {
        String listing = "";
        try {
            Socket socket = new Socket("localhost", 7777);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            OutputStream out = socket.getOutputStream();
            FileInputStream fis = new FileInputStream("AndroidLogo.png");
            byte[] bytes = fis.readAllBytes();
            out.write(bytes);
            DataOutputStream dataOutputStream = new DataOutputStream(out);
            dataOutputStream.flush();
            socket.shutdownOutput();
            fis.close();
            System.out.println("Came this far\n");
            String filename = "";
            while ((filename = in.readLine()) != null) {
                listing += filename + '\n';
            }
            socket.shutdownInput();
        } catch (Exception e) {
            System.err.println(e);
        }
        return listing;
    }
}