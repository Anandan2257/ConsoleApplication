package FolderManagement.model;

public class Item {
    private final String fileName;
    private final int size;
    public Item(String fileName,int size){
        this.fileName = fileName;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        return fileName + "( " + size +" KB )";
    }
}
