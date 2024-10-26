package utils;

import java.io.File;

public class FileUtility {
    public static boolean checkIfFileExists(String filePath){
        File f = new File(filePath);
        boolean b = f.exists();
        System.out.println("Checking if file " + filePath + "exists?  =>" + b);
        return b;
    }
}
