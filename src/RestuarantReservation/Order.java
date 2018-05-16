package RestuarantReservation;
import java.util.List;

public class Order implements CRUD<Food>{

	private int ID;
	private Table table;
	private List<Food> foodList;
	
	public Order(int ID, Table table, List<Food> foodList) {
		super();
		this.ID = ID;
		this.table = table;
		this.foodList = foodList;
	}
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
	
	public void create(Food f) {
		// TODO Auto-generated method stub
		
	}

	public List<Food> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Food f) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Food f) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return "Order [ ID = " + ID + ", table = " + table + ", foodList = " + foodList + " ] ";
	}
	
}
