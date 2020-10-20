package sample;

import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Module {
    public void createFile(String Kurs, String pressradio,String name, String family, String otchestvo, String nameFail,String  pathFile) throws IOException {
        File file = new File(pathFile +nameFail + "." + pressradio );
        FileWriter fos = new FileWriter(file);
        file.createNewFile();
        fos.write("Уважаемый, "+ name +" "+ family+ " " + otchestvo +"\n" +"Вы записались на курс: " + Kurs);
        fos.close();


    }
}
