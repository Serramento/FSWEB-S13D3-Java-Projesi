public class Main {
    public static void main(String[] args) {

        com.workintech.model.Person person2 = new com.workintech.model.Person("John", "Doe", 20);
        com.workintech.model.Person person = new com.workintech.model.Person("Serra", "Sarıhasan", 32, false, new String[]{"ING", "TR", "ITA"},"Gayrettepe");

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println(person);

        System.out.println("--------------");

        com.workintech.model.Wall wall = new com.workintech.model.Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}