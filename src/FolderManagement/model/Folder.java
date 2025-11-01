package FolderManagement.model;
import java.util.ArrayList;
import java.util.List;
public class Folder {
    private final String folderName;
    private final Folder parent;
    private final List<Folder> subFolder;
    private final List<Item> items;

    public Folder(String folderName,Folder parent){
        this.folderName = folderName;
        this.parent = parent;
        this.subFolder = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }

    public Folder getParent() {
        return parent;
    }

    public List<Folder> getSubFolder() {
        return subFolder;
    }

    public List<Item> getItems() {
        return items;
    }
    public void addFolder(Folder folder){
        subFolder.add(folder);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public Folder getFolder(String folderName){
        for(Folder f : subFolder){
            if(f.getFolderName().equalsIgnoreCase(folderName)){
                return f;
            }
        }
        return null;
    }

    public Item getItems(String itemName){
        for(Item i : items){
            if(i.getFileName().equalsIgnoreCase(itemName)){
                return i;
            }
        }
        return null;
    }

    public void removeFolder(String folderName){
        for(int i = 0; i < subFolder.size();i++){
            Folder f = subFolder.get(i);
            if(f.getFolderName().equalsIgnoreCase(folderName)){
                subFolder.remove(i);
                System.out.println(" Folder " + folderName + " removed successfully.");
                return;
            }
        }
        System.out.println("Folder not found: " + folderName);
    }

    public void removeItem(String item){
        for(int i = 0; i < items.size();i++){
            Item it = items.get(i);
            if(it.getFileName().equalsIgnoreCase(item)){
                subFolder.remove(i);
                System.out.println(" Item " +item + " removed successfully.");
                return;
            }
        }
        System.out.println("Item not found: " + item);
    }

    public String getPath() {
        if (parent == null) return "/" + folderName;
        return parent.getPath() + "/" + folderName;
    }
}
