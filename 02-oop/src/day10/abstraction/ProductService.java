package day10.abstraction;

public class ProductService extends DatabaseUtil{

	@Override
	public void insert() {
		
		System.out.println("insert into product");
		
	}

	@Override
	public void update() {
		System.out.println("update product");
		
	}

	@Override
	public boolean delete(int id) {
		System.out.println("DELETE FROM product WHERE id = " + id);
		return false;
	}

	@Override
	public Object[] getAll() {
		System.out.println("SELECT * FROM proudct");
		return null;
	}

	@Override
	public Object findById(int id) {
		System.out.println("SELECT * FROM proudct WHERE id = " + id);
		return null;
	}

	
}
