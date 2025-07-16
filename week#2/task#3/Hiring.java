// class Hiring
class Hiring {
    // static variables for global use : setting standard for hiring and as it will remain the same across the board hence why it is static.
    static int standardAge = 20;
    static int idealExperience = 3;
    static boolean goodtrackRecord = true;

    // instance variable for object use: it can have different values depending upon the object
    int age;
    int experience;
    boolean trackRecord;
    
    // constructor that uses the instance variables
    Hiring(int age, int experience, boolean trackRecord) {
        this.age = age;
        this.experience = experience;
        this.trackRecord = trackRecord;
    }
    
    // a static method that uses static variables for the standard and instance variables for the comparison against the standard
     static void compare(int age, int experience, boolean trackRecord) {
        if(age>=standardAge && experience>=idealExperience && trackRecord == goodtrackRecord) {
            System.out.println("Success");
        }
        else {
            System.out.println("Rejected.");
        }
    }
    
public static void main(String[] args) {
    Hiring ideal = new Hiring(standardAge, idealExperience, goodtrackRecord);
    
    Hiring person1 = new Hiring(21, 4, true);
    compare(person1.age, person1.experience, person1.trackRecord);
}
}
