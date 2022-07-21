package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Veri Tabanı");
		
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ");
		Instructor instructor2 = new Instructor(2,"Halit Kalaycı");
		
		Course course1 = new Course(1, "JavaScript", 70, instructor1, category1);
		Course course2 = new Course(1, "Java", 60, instructor2, category2);
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.getId());
			System.out.println(course.getName());
			System.out.println(course.getPercent());
			System.out.println(course.getInstructor().getFullName());
			System.out.println(course.getCategory().getName());
			System.out.println("-----------------");
		}
		
		System.out.println("************************************************");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category1);
		categoryManager.delete(category2);
		categoryManager.update(category2);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);					
	}
}
