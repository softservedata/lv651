package com.softserve.edu.hw10;


	import java.util.*;
	import java.util.stream.Collectors;

	/**
	 * Write class Student that provides information about the name of the student and his course. 
	 * Class Student should consist of
	 * - properties for access to these fields
	 * - constructor with parameters
	 * - method printStudents (List students, Integer course), 
	 * 	 which receives a list of students and the course number and prints to the console the names of the students from the list, 
	 *   which are taught in this course (use an iterator)
	 * - methods to compare students by name and by course
	 * In the main() method 
	 * - declare List students and add to the list five different students
	 * - display the list of students ordered by name
	 * - display the list of students ordered by course. 
	 *
	 */
	public class Hw3 {

		public static void main(String[] args) {
			List<Student> students = new LinkedList<Student>();
			students.add(new Student("Quentin Tarantino", 5));
			students.add(new Student("John Travolta", 1));
			students.add(new Student("Uma Thurman", 2));
			students.add(new Student("Al Pacino", 3));
			students.add(new Student("Brad Pitt", 2));
			
			System.out.println("All students:");
			Student.printStudents(students);
			System.out.println("");
			System.out.println("Students from course 2:");
			Student.printStudents(students, 2);
			
			System.out.println("");
			System.out.println("All students sorted by name:");
			students.sort(Student.getNameComparator());
			Student.printStudents(students);

			System.out.println("");
			System.out.println("All students sorted by course:");
			students.sort(Student.getCourseComparator());
			Student.printStudents(students);
			
		}

	}

	class Student {
		private String name;
		private int course;
		
		private static NameComparator nameComparator;
		private static CourseComparator courseComparator;
		
		static {
			nameComparator = new NameComparator();
			courseComparator = new CourseComparator();
		}
		
		public static Comparator getNameComparator() {
			return Student.nameComparator;
		}
		
		public static Comparator getCourseComparator() {
			return Student.courseComparator;
		}
		
		public Student(String name, int course) {
			this.setName(name);
			this.setCourse(course);
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getCourse() {
			return course;
		}
		
		public void setCourse(int course) {
			this.course = course;
		}
		
		public String toString() {
			return String.format("Name: %s, course #%d", this.getName(), this.getCourse());
		}
		
		public static void printStudents(List<Student> students) {
			Iterator i = students.iterator();
			while (i.hasNext()) {
				Student student = (Student)i.next();
				System.out.println(student);
			}
		}
		
		public static void printStudents(List<Student> students, int course) {
			Student.printStudents(
				students.stream().filter(student -> student.getCourse() == course).collect(Collectors.toCollection(() -> new ArrayList<Student>()))
			);	
		}
		
		static class NameComparator implements Comparator {
			@Override
			public int compare(Object s1, Object s2) {
				return ((Student)s1).getName().compareTo(((Student)s2).getName());
			}
			
		}
		
		static class CourseComparator implements Comparator {
			@Override
			public int compare(Object s1, Object s2) {
				return ((Student)s1).getCourse() - ((Student)s2).getCourse();
			}
			
		}
	}

