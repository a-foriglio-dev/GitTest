public class Teacher extends Person {
    private int counter = 0;
    private int id;
    public Teacher(String name, String gender) {
        super(name, gender);
        this.id = counter++;
    }
    

    
}
