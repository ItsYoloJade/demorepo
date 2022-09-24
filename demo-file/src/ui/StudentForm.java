package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Person;
import dol.Student;
import misc.DateUtil;

public class StudentForm  {
	Scanner scan;
	Person student;
	
	public StudentForm(Scanner scanner) {
		scan = scanner;
	}
	
	public StudentForm(Student s) {
		student = s;
	}

	
	
	
	public Student catchStudent() {
		Student s = new Student();
		
		System.out.println("Primer nombre: ");
		s.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		s.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		s.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		s.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		s.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		s.setBirthDate(date);
		
		Date Inscriptiondate = DateUtil.catchValidDate(scan, "Fecha de inscripcion (dd/MM/yyyy): ");
			
		return s;
	}
	
	public void showStudent() {
		System.out.printf("Primer nombre: %s\n" , student.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", student.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", student.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", student.getSecondSurname());
		
		System.out.printf("Género: %s\n", student.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(student.getBirthDate(), "dd/MM/yyyy"));
		
		System.out.printf("Fecha de inscripcion: %s\n", DateUtil.dateToString(((Student) student).getInscriptiondate(), "dd/MM/yyyy"));


			
	}

}
