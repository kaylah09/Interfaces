import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Text", "txt"));
        int result = chooser.showOpenDialog(null);
        if (result != JFileChooser.APPROVE_OPTION) {
            System.out.println("No file chosen :( ");
            return;
        }

        File txtFile = chooser.getSelectedFile();
        Filter filter = new ShortWordFilter();

        try (Scanner scan = new Scanner(txtFile)) {
            while (scan.hasNext()) {
                String word = scan.next();
                if (filter.accept(word)) {
                    System.out.println(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file");
        }

    }
}
