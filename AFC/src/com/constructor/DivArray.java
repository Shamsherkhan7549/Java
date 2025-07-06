package com.constructor;

import java.util.Arrays;

public class DivArray {
	  private int[] data;

	    public DivArray() {
	        this.data = new int[] {1, 2, 3}; // default values
	    }

	    public DivArray(DivArray other) {
	        this.data = other.data.clone(); // deep copy of array
	    }

	    public int[] getData() {
	        return data;
	    }

	    public void setData(int[] data) {
	        this.data = data;
	    }


	    public Object clone() throws CloneNotSupportedException {
	        DivArray copy = new DivArray();
	        copy.data = this.data.clone();  // clone array
	        return copy;
	    }

		@Override
		public String toString() {
			return "DivArray [data=" + Arrays.toString(data) + "]";
		}

	   
	

}
