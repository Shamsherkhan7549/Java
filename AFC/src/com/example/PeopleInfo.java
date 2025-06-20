package com.example;

public class PeopleInfo {
	
	public static void validateGender(String gender) {
		
		try {
			if(gender == "male"|| gender == "female") {
				
				System.out.println("Valid Gender");
			}else {
				throw new ValidateGender("Error: There should be male or female");
			}
		}catch(ValidateGender ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String str[]) {
		validateGender("male");
	}
	}
