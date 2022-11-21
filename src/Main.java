import java.util.Arrays;

public class Main {

    public static void main(String[] agrs) {
        Student student = new Student("Ivan");
        Student student1 = new Student("Sasha");
        Student student2 = new Student("Masha");
        Student student3 = new Student("Jenya");
        Student student4 = new Student("Ted");
        Student student5 = new Student("Kate");
        Student student6 = new Student("Vova");
        Student student7 = new Student("Tasha");

        Group group = new Group("Java");
        Group group1 = new Group("Python");
        Group group2 = new Group("JS");

        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        System.out.println("-----------------------------------");

        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        System.out.println("-----------------------------------");

        group2.addStudent(student6);
        group2.addStudent(student7);
        System.out.println("-----------------------------------");


        Group[] gr = {group, group1, group2};
        System.out.println("-----------------------------------");

        Group.findGroup("Java", gr);
        System.out.println("-----------------------------------");
        Group.allGroupsInfo(gr);


    }
}
