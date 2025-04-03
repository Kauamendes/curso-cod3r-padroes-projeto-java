package br.com.cod3r.composite.folders.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Folder implements FileSystemItem {

    private String name;
    private List<FileSystemItem> children;

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        children.forEach(c -> c.print(structure + "| "));
    }
}
