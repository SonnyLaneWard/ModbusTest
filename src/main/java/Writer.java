import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Writer {


    public static void write(float s) {
        String username = System.getProperty("user.name");

        System.out.println(username);

        try(FileWriter writer = new FileWriter("C:/Users/" + username + "/Desktop/" + "ModbusOut.txt", StandardCharsets.UTF_8, true))
        {

            writer.write(s + "\n");





            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
