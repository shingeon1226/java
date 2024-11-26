package week12;

public class CarTest {
    public static void main(String[] args) {
        // Create a Car object with specific details
        Car hy1 = new Car("1234", "현대", "현대X", 10000);
        hy1.run(30);  // Call the run method with a speed of 30
        String result = hy1.toString();  // Get the string representation of the car
        System.out.println(result);  // Print car details

        // Change color and mile attributes
        hy1.setColor("red");
        hy1.setMile(20000);

        result = hy1.toString();  // Get the updated string representation
        System.out.println(result);  // Print updated car details
    }
}

class Car {
    private String no;
    private String company;
    private String color;
    private int mile;

    // Default constructor
    public Car() {
        this.no = "0000";
        this.company = "Korea";
        this.color = "white";
        this.mile = 0;
    }

    // Constructor with no and company
    public Car(String no, String company) {
        this.no = no;
        this.company = company;
        this.color = "black";
        this.mile = 0;
    }

    // Constructor with no, company, and color
    public Car(String no, String company, String color) {
        this.no = no;
        this.company = company;
        this.color = color;
        this.mile = 0;
    }

    // Constructor with no, company, color, and mile
    public Car(String no, String company, String color, int mile) {
        this.no = no;
        this.company = company;
        this.color = color;
        this.mile = mile;
    }

    // Getters and Setters
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    // Method to simulate the car running at a certain speed
    public void run(int speed) {
        System.out.println(speed + " 속도로 달린다.");
    }

    // toString method for displaying car details
    @Override
    public String toString() {
        return "Car [no=" + no + ", company=" + company + ", color=" + color + ", mile=" + mile + "]";
    }
}
