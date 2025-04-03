package br.com.cod3r.composite.folders.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileSystemItem {

    private String name;

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
