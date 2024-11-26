package week12;

public class 과제 {

    public static void main(String[] args) {
        
        Dog d1 = new Dog("망고", "골든리트리버", 2);
        Dog d2 = new Dog("까미", "믹스", 3);

        
        System.out.println("d1 => " + d1);  
        System.out.println("d2 => " + d2);  
    }
}

class Dog {
    private String name;
    private String breed;
    private int age;

    
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "{" + name + ", " + breed + ", " + age + "세}";
    }
}
