package kodlamaio;

public class Course {
	
	private int id;
	private String name;
	private int percent;
	private Instructor instructor;
	private Category category;
	
	public Course() {
	}

	public Course(int id, String name, int percent, Instructor instructor, Category category) {
		this.id = id;
		this.name = name;
		this.percent = percent;
		this.instructor = instructor;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
