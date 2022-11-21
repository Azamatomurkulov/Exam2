public class Group {
    private static int id;
    private String nameOfGroup;


    private Student[] students = new Student[5];


    public Group(String nameOfGroup) {
    this.nameOfGroup = nameOfGroup;
       id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean addStudent(Student student){
        for (int i = 0; i < students.length ; i++) {
            if(students[i]==null){
                students[i]=student;
                System.out.println("Вы добавили студента: "+student.getName());
                return true;
            }
        }
        System.out.println("Мест больше нету");
        return false;

    }
    public void groupInfo(){
        System.out.println("Название группы: "+this.getNameOfGroup()+" \nСтуденты:");
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null){
                System.out.println(students[i]);
            }
            }
        }


    public static void findGroup(String name,Group[] groups){
        for (int i = 0; i < groups.length; i++) {
            if(groups[i].getNameOfGroup().equals(name)&&groups[i]!=null){
                System.out.println("Вы искали: ");
                groups[i].groupInfo();
            }
        }
    }
    public static void allGroupsInfo(Group[] groups){
        for (int i = 0; i < groups.length; i++) {
            if(groups[i]!=null){
                groups[i].groupInfo();
            }
        }
    }

}


