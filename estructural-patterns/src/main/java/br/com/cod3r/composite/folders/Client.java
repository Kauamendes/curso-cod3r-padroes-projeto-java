package br.com.cod3r.composite.folders;

import br.com.cod3r.composite.folders.model.Composite;
import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		FileSystemItem file1 = new File("File1.txt");
		FileSystemItem file2 = new File("File2.txt");
		FileSystemItem file3 = new File("File3.txt");
		FileSystemItem file4 = new File("File4.txt");

		FileSystemItem sf1 = new Folder("sf1", List.of(file1));
		FileSystemItem sf2 = new Folder("sf2", List.of(file2, sf1));

		FileSystemItem folder = new Folder("folder", List.of(sf2, file3, file4));

		folder.print("");

		System.out.println("-----------------\n");

		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = Composite.ofFile(new java.io.File(dir));
		fromDisk.print(">");
	}
}
