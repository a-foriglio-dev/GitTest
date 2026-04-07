public class Teacher extends Person {
    private int counter = 0;
    private int id;
    private int age;
    public Teacher(String name, String gender, int age) {
        super(name, gender);
        this.id = counter++;
        this.age = age;
    }

    public int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    
    public int getAge(){
        return age;
    }
    
}
