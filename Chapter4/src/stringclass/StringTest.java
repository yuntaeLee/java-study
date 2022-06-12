package stringclass;

import java.lang.reflect.Constructor;

import com.sun.jdi.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c3 =  Class.forName("java.lang.String");
		
		Constructor<String>[] cons =  c3.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		java.lang.reflect.Method[] methods = c3.getMethods();
		for(java.lang.reflect.Method  method : methods) {
			System.out.println(method);
		}

	}

}
