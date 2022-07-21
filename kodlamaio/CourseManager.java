package kodlamaio;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getName() + " eklendi.");
	}
	public void delete(Course course) {
		System.out.println(course.getName() + " silindi.");
	}
	public void update(Course course) {
		System.out.println(course.getName() + " güncellendi.");
	}
}
