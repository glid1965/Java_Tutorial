
public class Puppy{
	
	int PuppyAge;

   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Puppy's Name is: " + name ); 
      }
   
   public void setAge(int age) {
       PuppyAge = age;
   }

   public int getAge( ) {
       System.out.println("Puppy's age is: " + PuppyAge ); 
       return PuppyAge;
   }

   public static void main(String []args) {
      // Create object myPuppy
      Puppy MyPuppy = new Puppy("Tommy");
      
      /* Call class method to set puppy's age */
      MyPuppy.setAge(2);

      /* Call another class method to get puppy's age */
      MyPuppy.getAge( );

      /* Access instance variable as well */
      System.out.println("Variable Value: " + MyPuppy.PuppyAge );
   }
}
