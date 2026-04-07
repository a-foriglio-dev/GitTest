abstract public class Person {
    private String name;
    private String gender;
    

    public Person(String name, String gender, int counter){
        this.name = name;
        this.gender = gender;
        
    }


    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }
}
