package com.Bana.app.custom;

public class TestAgeValidation {
  public static void main(String[] args) {
    TestAgeValidation test=new TestAgeValidation();
    try{
      test.validateAge(26);
    }catch(AgeValidationException e){
      e.printStackTrace();
      System.out.println(e.getMessage());
    }finally{
      System.out.println("Close the session");
    }
  }

  public void validateAge(int age) throws AgeValidationException {
    if (age < 25) {
      throw new AgeValidationException("Age must be 18 or older.");
    }
  }
}
