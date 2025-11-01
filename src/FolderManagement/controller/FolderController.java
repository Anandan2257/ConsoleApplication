package FolderManagement.controller;

import FolderManagement.model.Folder;
import FolderManagement.model.Item;

public class FolderController {
    private static FolderController instance;
    private Folder root;
    private final Folder current;

    private FolderController(){
        root = new Folder("root",null);
        current = root;
    }

    public static FolderController getInstance(){
        if(instance == null){
            instance = new FolderController();
        }
        return instance;
    }

    public Folder getCurrent() {
        return current;
    }

    public void createFolder(String name){
        if(current.getFolder(name) != null){
            System.out.println("Folder already Exists!");
        }
        current.addFolder(new Folder(name,current));
        System.out.println(" Folder " + name + " created.");
    }

    public void createItem(String item,int size){
        if(current.getItems(item) != null){
            System.out.println("Item already Exists!");
        }
        current.addItem(new Item(item,size));
        System.out.println(" Folder " + item + " created.");
    }

    public void listContent(){
        System.out.println("Folder: " + current.getPath());

        if(current.getSubFolder().isEmpty() && current.getItems().isEmpty()){
            System.out.println("(Empty)");
            return;
        }
        if(!current.getFolderName().isEmpty()){
            System.out.println("Folders:");
            for(Folder f : current.getSubFolder()){
                System.out.println(" - " + f.getFolderName());
            }
        }
        if (!current.getItems().isEmpty()) {
            System.out.println("Items:");
            for (Item i : current.getItems())
                System.out.println(" - " + i);
        }
    }
}
