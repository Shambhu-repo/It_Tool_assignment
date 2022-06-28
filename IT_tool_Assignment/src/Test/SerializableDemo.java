package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	public Student(int id , String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		//serializationOfStudent();
		deserializationOfStudent();
		
	}
		
		
		public static void serializationOfStudent() throws IOException {
			try {
				Student s = new Student(25,"shambhu");

				FileOutputStream fout = new FileOutputStream("C:\\Users\\sushi\\Desktop\\f.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				out.writeObject(s);
				out.flush();
				out.close();
				System.out.println("sucess");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public static void deserializationOfStudent() throws IOException, ClassNotFoundException {
			try {
				//Student s = new Student(25,"shambhu");

				FileInputStream fin = new FileInputStream("C:\\Users\\sushi\\Desktop\\f.txt");
				ObjectInputStream in=new ObjectInputStream(fin);
				Student s = (Student)in.readObject();
				System.out.println(s.id + " " + s.name);
				
				in.close();
				System.out.println("sucess");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


		}
		// TODO Auto-generated method stub
		