package fcu.iecs.oop.password;

public class PasswordEncorder {
	
	public void setName(String name) {
		name=name.replace('a', '4');
		name=name.replace('A', '4');
		name=name.replace('E', '3');
		name=name.replace('e', '3');
		name=name.replace('I', '1');
		name=name.replace('i', '1');
		name=name.replace('O', '0');
		name=name.replace('o', '0');
		name=name.replace('T', '7');
		name=name.replace('t', '7');
		System.out.println(name);
	}

}
