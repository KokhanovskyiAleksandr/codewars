import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/task4/instructions.txt";
        FileReader fr =
                new FileReader(fileName);

        int input;
        StringBuilder st = new StringBuilder();
        while ((input = fr.read()) != -1) {
            st.append((char) input);
        }
        String[] array = st.toString().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != 0 && i % 10 == 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(" ");
        }
        FileWriter writer = new FileWriter(fileName);
        writer.write(stringBuilder.toString());
        writer.flush();
        writer.close();
    }
}
