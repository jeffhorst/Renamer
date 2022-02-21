import java.io.File;

public class Renamer {

    public static void main(String[] args) {
        String path = "C:\\Users\\Jeff\\Downloads\\Andromeda\\Season.5";
        String textToReplace = ".DVDrip.XviD";
        String replacementText = "";
        printAllFilesInFolder(path);
        removeTextFromFileName(path, textToReplace);
        // replaceTextInileName(path, textToReplace, replacementText);
    }

    public static void replaceTextInileName(String path, String textToReplace, String replacementText) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.toString().contains(textToReplace)) {
                String fileName = file.getName();
                String pathToFile = file.toString().replace(fileName, "");
                String updatedFileName = fileName.replace(textToReplace, replacementText);
                file.renameTo(new File(pathToFile + updatedFileName));
            }
        }
    }

    public static void removeTextFromFileName(String path, String textToRemove) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.toString().contains(textToRemove)) {
                String fileName = file.getName();
                String pathToFile = file.toString().replace(fileName, "");
                String updatedFileName = fileName.replace(textToRemove, "");
                file.renameTo(new File(pathToFile + updatedFileName));
            }
        }
    }

    public static void printAllFilesInFolder(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.toString());
        }
    }

}
