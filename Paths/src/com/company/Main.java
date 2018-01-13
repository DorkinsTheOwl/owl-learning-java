package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println();
//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);
        System.out.println();
        filePath = Paths.get("D:\\programming\\java\\ForWorkInPathsFolder.txt");
        printFile(filePath);
        System.out.println();

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
        System.out.println();
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());

        Path path3 = FileSystems.getDefault().getPath("thisfiledoesnotexist.txt");
        System.out.println();
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get(".", "nonExistantPath", "nonExistantFile.txt");
        System.out.println();
        System.out.println(path4.toAbsolutePath());

        filePath = FileSystems.getDefault().getPath("files");
        System.out.println();
        System.out.println("Exists = " + Files.exists(filePath));
        System.out.println("Exists = " + Files.exists(path4));

    }

    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
