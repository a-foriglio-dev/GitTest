public class Student extends Person {
    private int counter = 0;
    private int id;
    public Student(String name, String gender) {
        super(name, gender);
        this.id = counter++;
        
    }
    public int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    

    
}
