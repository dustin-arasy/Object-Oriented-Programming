package Session7;

public class Main {
    public static void main(String[] args) {
    	IInterface i = new Coba();
    	i.method1();
    	System.out.println("Atk");
    }
}

/*
 * class vs abstract class vs interface
 * 
 * abstract class ->
 * suatu class yang memiliki method yang belum di definisikan
 * variable constant atau tidak
 * cuma bisa di extend 1 kali
 * 
 * interface ->
 * semua method nya abstract
 * semua variable constant * 
 * implement -> boleh lebih dari 1
 */

interface IInterface
{
	int constanta1 = 1;
	void method1();
}

interface IInterface1{
	int constanta2 = 2;
	void method2();
}


class Parent{
	int a;
}

class Coba extends Parent implements IInterface, IInterface1 
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method sub
	}
	
}

