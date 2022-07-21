package kodlamaio;

public class CategoryManager {

	public void add(Category category) {
		System.out.println(category.getName() + " eklendi.");
	}
	public void delete(Category category) {
		System.out.println(category.getName() + " silindi.");
	}
	public void update(Category category) {
		System.out.println(category.getName() + " güncenllendi.");
	}
}
