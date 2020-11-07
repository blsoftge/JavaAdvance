package br.com.blsoft.javaadvance.video29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("dadosFake.txt")).forEach(System.out::println);
    }
}
