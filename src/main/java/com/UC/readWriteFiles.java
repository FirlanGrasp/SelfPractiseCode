package com.UC;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class readWriteFiles {

    public static void main(String[] args) {
        String filePath = "C:/Users/chens/Desktop/国家机构.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                System.out.println("文件未找到，将创建新文件。");
                // 创建新文件并写入一些初始数据
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write("这是一个新创建的文件。\n");
                    System.out.println("新文件已创建。");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                e.printStackTrace();
            }
        }

        Path path = Paths.get("C:/Users/chens/Desktop/国家机构.txt");
        if (!Files.exists(path)) {
            System.out.println("文件不存在");
            try {
                Files.createFile(path);
                Files.write(path, "这是一个新创建的文件。\n".getBytes());
                System.out.println("新文件已创建。");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                String content = Files.lines(path)
                        .collect(Collectors.joining("\n"));
                System.out.println(content);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
