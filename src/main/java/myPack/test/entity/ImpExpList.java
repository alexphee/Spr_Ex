package myPack.test.entity;

public class ImpExpList {
	private ImpExp shelf;
	private Storage storage;
	private Shelf quantity;
	
	public ImpExpList() {}
	
	public ImpExpList(ImpExp shelf, int storage, int  quantity) {
		super();
		this.shelf = shelf;
		this.storage = new ImpExp().getStorage();
		this.quantity = new ImpExp().getShelf();
	}

	public ImpExp getShelf() {
		return shelf;
	}

	public void setShelf(ImpExp shelf) {
		this.shelf = shelf;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Shelf getQuantity() {
		return quantity;
	}

	public void setQuantity(Shelf quantity) {
		this.quantity = quantity;
	}
	
	

}

