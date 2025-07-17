// Count can only be properly done by static as it is in the whole class, while using local variable can only be made in a method and will vanish and will be redeclared & initilized again as the method is called again.

class Hire {
    // static variable
    static int COUNT_APPLICANTS;
    
    // instance variables to store attributes of object: applicant
    int age;
    int experience;
    boolean goodTrackRecord;
    // constructor for the object: applicant
    Hire(int age, int experience, boolean goodTrackRecord) {
        this.age = age;
        this.experience = experience;
        this.goodTrackRecord = goodTrackRecord;
        // increment of the static variable to know how many applicants there are by how many times the object: applicant is made
        COUNT_APPLICANTS++;
    }
    
    public static void main(String[] args) {
        // objects
        Hire applicant1 = new Hire(20, 2, true);
        Hire applicant2 = new Hire(18, 1, true);
        Hire applicant3 = new Hire(30, 7, false);
        // prints how many applicants
        System.out.print(COUNT_APPLICANTS);
    }
    
}
