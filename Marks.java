import java.io.*;
import java.util.*;

public class Marks {
	ArrayList<Student> students;
	
	public Marks() {
		students = new ArrayList<>();
	}
	
	private void setMarks (String fileName) throws Exception {
		try (FileReader fr = new FileReader(fileName); Scanner scan = new Scanner(fr)) {
			while (scan.hasNextLine()) {
				Student nStudent = new Student();
				students.add(nStudent.setInfo(scan.nextLine()));
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("File err" + e);
		}
	}
	
	private void printMarks (String fileName) throws Exception {
		try (FileWriter fw = new FileWriter(fileName)) {
			for (int i = 0; i < students.size(); i++) {
				String s = students.get(i).getString();
				fw.write(s);
				fw.write("\n");
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("File err" + e);
		}
	}
	
	public static void main (String[] args) throws Exception {
		Marks m = new Marks();
		m.setMarks("input.txt");
		m.printMarks("output.txt");
		
	}
}
