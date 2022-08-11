public class Person {
   public static String className="Person";
    int age;
    String hairColor;

    public Person( int age, String hairColor) {
        this.age = age;
        this.hairColor = hairColor;
    }

    public static String returnClassName(){
        return className;
    }
}
