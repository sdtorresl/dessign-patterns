package co.edu.unisabana.solid.repository;

import co.edu.unisabana.solid.data.IFIleDB;

public class FileManager implements  IFileOperations {
    private IFIleDB ifIleDB;

    public FileManager(IFIleDB ifIleDB) {
        this.ifIleDB = ifIleDB;
    }

    @Override
    public void saveFile(String name) {}
}
