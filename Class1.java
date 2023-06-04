/*
 *   @author : xdqiang
 */
public class Class1 {
    public static void main(String[] args) {
        System.out.println("Start learning Git...");
        Animal animal = new Animal("Cat",6, "boy");
        animal.move();
    }
}

class Animal{
    String name;
    int age;
    String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void move(){
        System.out.printf("The %S is moving !%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
