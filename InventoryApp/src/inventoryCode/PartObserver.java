package inventoryCode;

public interface PartObserver {
	abstract public void updateObserver(Part part);
	abstract public void modelDeleted();
}
