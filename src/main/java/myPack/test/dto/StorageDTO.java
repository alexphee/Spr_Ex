package myPack.test.dto;

public class StorageDTO {
	private int id;
	private int storageName;
	public StorageDTO(int id, int storageName) {
		super();
		this.id = id;
		this.storageName = storageName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStorageName() {
		return storageName;
	}
	public void setStorageName(int storageName) {
		this.storageName = storageName;
	}
	@Override
	public String toString() {
		return "StorageDTO [id=" + id + ", storageName=" + storageName + "]";
	}
	
	
}
