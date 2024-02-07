package systemManager;

import java.io.*;

public abstract class FileManage {

    public static File[] getAllFile(String folderURL) {
        File folder = new File(folderURL);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            return files;
        }
        System.out.println("Wrong folderURL");
        return null;
    }
}
