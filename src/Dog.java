package src;
//Dog Class
public class Dog {

    String name;
    private String breed;
    private int age;

    
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Name:" + name + " Breed:" + breed + " Age:" + age;
    }
}