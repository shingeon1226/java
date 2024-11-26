package week12;

public class LoveTest {

    public static void main(String[] args) {
        // Creating Love objects with correct details
        Love love1 = new Love("카리나", 2024, "남이섬가서 사랑을 고백하고 종교때문에 헤어짐", 1, 10);
        Love love2 = new Love("honey", 2014, "동네 꼬마 친구", 3, 2);

        // Printing the details of the Love objects using the print method
        love1.print();
        love2.print();
    }
}

class Love {
    private String name;
    private int year;
    private String story;
    private int period;
    private int level;

    // Constructor to initialize the fields
    public Love(String name, int year, String story, int period, int level) {
        this.name = name;
        this.year = year;
        this.story = story;
        this.period = period;
        this.level = level;
    }
    public void talking() {}

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Custom print method to display Love object details in the desired format
    public void print() {
        System.out.println("Love [name=" + name + ", year=" + year + ", story=" + story + ", period=" + period + ", level=" + level + "]");
    }

    // Overridden toString() method to provide string representation of the object
    @Override
    public String toString() {
        return "Love [name=" + name + ", year=" + year + ", story=" + story + ", period=" + period + ", level=" + level + "]";
    }
}
