package com.example.browser;

import javafx.scene.control.Alert;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHelper {
    public static List<String> loadFileContent(String filePath) {
        try {
            List<String> result = Files.readAllLines(Path.of(filePath));
            return result;
        } catch (IOException e) {
            return null;
        }
    }
}