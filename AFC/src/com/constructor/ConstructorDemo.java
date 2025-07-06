package com.constructor;

public class ConstructorDemo implements Cloneable {
	//Attribute
		private int id;
		private String msg;
		private String email;
		
		DivArray dv = new DivArray();

		
		public ConstructorDemo() {}
		
		public ConstructorDemo(int id, String msg, String email) {
			super();
			this.id = id;
			this.msg = msg;
			this.email = email;
		}
		
		
		protected Object clone() throws CloneNotSupportedException {
			ConstructorDemo copy = (ConstructorDemo) super.clone();
	        copy.dv = (DivArray) dv.clone();  // deep copy of reference type
	        return copy;
		}
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getMsg() {
			return msg;
		}



		public void setMsg(String msg) {
			this.msg = msg;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		@Override
		public String toString() {
			return "ConstructorDemo [id=" + id + ", msg=" + msg + ", email=" + email + "]";
		}





	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo obj = new ConstructorDemo(111,"Hello Student","student@gmail.com");
		ConstructorDemo obj1 = new ConstructorDemo(222,"Hello user","user@gmail.com");
		System.out.println(obj);
		System.out.println(obj1);
		obj.setId(1);
		obj.setMsg("Hello");
		obj.setEmail("hello@gmail.com");
		System.out.println(obj);
		try
		{
		ConstructorDemo obj3 =(ConstructorDemo ) obj1.clone();
		obj3.setId(12);
		System.out.println(obj3);
		System.out.println(obj1);
		int []ar=obj3.dv.getData();
		for(int data: ar)
		{
			System.out.println(data);
		}
		}
		catch( CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
		
		
		
		

		

	}

}
