package br.com.cod3r.composite.folders.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Composite {

    public static FileSystemItem ofFile(File file) {
        if (!file.isDirectory()) return new br.com.cod3r.composite.folders.model.File(file.getName());
        List<FileSystemItem> childs = new ArrayList<>();
        File[] files = file.listFiles();
        for (File javaFile : files) {
            childs.add(ofFile(javaFile));
        }
        return new Folder(file.getName(), childs);
    }
}
