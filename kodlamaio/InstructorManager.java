package kodlamaio;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFullName() + " eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFullName() + " silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFullName() + " güncellendi.");
	}
}
