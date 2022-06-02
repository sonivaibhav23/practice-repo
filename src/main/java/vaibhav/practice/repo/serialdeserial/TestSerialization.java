package vaibhav.practice.repo.serialdeserial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Demo implements Serializable {

	private static final long serialVersionUID = 15L;

	private int a;
	private int b;
	private static int c = 5;
	private transient int d = 9;

	public Demo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d;
	}

}

public class TestSerialization {

	public static void main(String[] args) {
		Demo demo = new Demo(1, 2);
		Demo demo2 = null;
		try {
			FileOutputStream fos = new FileOutputStream(new File("serializedFile.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(demo);

			fos.close();
			oos.close();

		} catch (IOException e) {

		}

		try {
			FileInputStream fis = new FileInputStream(new File("serializedFile.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);

			demo2 = (Demo) ois.readObject();
		} catch (ClassNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(demo.hashCode());
		System.out.println(demo);
		System.out.println(demo2.hashCode());
		System.out.println(demo2);

		// *** Output ***
		// 492228202
		// a = 1, b = 2, c = 5, d = 9
		// 128893786
		// a = 1, b = 2, c = 5, d = 0
	}

}
