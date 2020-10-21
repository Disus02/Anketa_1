package sample;

import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Module {
    public void createFile(String Kurs, String pressradio,String name, String family, String otchestvo, String nameFail,String  pathFile) throws IOException {
        File file = new File(pathFile + "/" +nameFail + "." + pressradio );
        FileWriter fos = new FileWriter(file);
        file.createNewFile();
        fos.write("Уважаемый, "+ name +" "+ family+ " " + otchestvo +"\n" +"Вы записались на курс: " + Kurs);
        fos.close();


    }
    public void openFile(String path,String nameFile,String pas) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file1=new File(path+"/"+ nameFile +"."+ pas);
        if (!(file1==null)){
            desktop.open(file1);
        }
    }
    public void openDir(TextField path){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Выбрать папку");
        File dir = directoryChooser.showDialog(new Stage());
        if (!(dir==null)){
            path.setText(dir.getAbsolutePath());
        }

    }
}
