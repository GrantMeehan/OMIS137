import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringsHW {
    public static void main(String[] args) {

        File musicFile = new File("music.txt");
        ArrayList<String> musicList = new ArrayList<>();

        try {
            Scanner reader = new Scanner(musicFile);
            while(reader.hasNextLine()) {
                musicList.add(reader.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: " + fnfe.getMessage());
            System.out.println("Please correct the file name and rerun the program.");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter file name: ");
//            String path = sc.next();
//            musicFile = new File(path);
        }

        musicList.removeIf(line -> line.contains("no author listed"));
        for (String line:musicList) {
            int index = musicList.indexOf(line);
            line = line.trim();
            line = line.substring(line.indexOf('.') + 2);
            line = line.replace("  ", " ");

            int lastDashIndex = line.lastIndexOf('-');
            if (line.charAt(lastDashIndex - 1) != ' ')
                line = line.substring(0, lastDashIndex) + " " + line.substring(lastDashIndex);
            lastDashIndex = line.lastIndexOf('-');
            if (line.charAt(lastDashIndex + 1) != ' ')
                line = line.substring(0, lastDashIndex + 1) + " " + line.substring(lastDashIndex + 1);

            String songTitle = line.substring(0, lastDashIndex - 1);
            String composer = line.substring(lastDashIndex + 2);

            songTitle = songTitle.replace("-", " ");
            songTitle = songTitle.replace("  ", " ");

            if (composer.contains(" ")) {
                int lastSpaceInComposerIndex = composer.lastIndexOf(' ');
                composer = composer.substring(lastSpaceInComposerIndex + 1) + ", " + composer.substring(0, lastSpaceInComposerIndex);
            }

            if (songTitle.startsWith("A ")) {
                songTitle = songTitle.substring(2) + ", " + songTitle.charAt(0);
            }

            if (songTitle.startsWith("An ")) {
                songTitle = songTitle.substring(3) + ", " + songTitle.substring(0,2);
            }

            if (songTitle.startsWith("The ")) {
                songTitle = songTitle.substring(4) + ", " + songTitle.substring(0,3);
            }

            line = composer + " - " + songTitle;

            musicList.set(index, line);
        }

        musicList.sort(String::compareToIgnoreCase);

        for (String line:musicList) {
            System.out.println(line);
        }
    }
}
