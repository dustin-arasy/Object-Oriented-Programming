package Session4;

public class Student { //atribut clas nya
    private String id;
    private String name;
    private String className;
    private int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20){
            throw new IllegalArgumentException("Panjang Nama mesti lebih pendek dari 20");
        }
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String name, String className) {
        id = "" + (long) (Math.random() * 4000000000L);
        setName(name);
        this.className = className;
    }

    void study() { //method atau behavior namanya
        if (score + 10 < 100) {
            score += 10;
        } else {
            score = 100;
        }
        System.out.println("Study " + score);
    }

    void show() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Score: " + score);
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("score mesti diantara 0-100.");
        }
        this.score = score;
    }

    /** access modifier -> encapsulation
     *                      class | package |  turunan   | public
     * public               x   | x         | x          | x
     * protected            x   | x         | x          |
     * package/default      x   | x         |            |
     * private              x   |           |            |
     *
     * setter / getter
     */
}
    class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Steven", "PPTI 16");
            student1.show();
            student1.study();
            student1.study();
            student1.setScore(100);
            student1.show();
        }
    }
