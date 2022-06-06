package utils;

import enums.FileNames;
import enums.Paths;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import java.util.Properties;

public class PropertyUtils {
    private static final Properties prop = new Properties();
    public static String readDataFromFiles(String key, Paths filePath, FileNames fileName) {
        String fullPath = filePath.toString() + fileName.toString();
        try {
            InputStream input = new FileInputStream(fullPath);
            prop.load(new InputStreamReader(input, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
