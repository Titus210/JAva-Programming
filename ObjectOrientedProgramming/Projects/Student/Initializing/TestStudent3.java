class Student{
    int id;
    String name;
}

class TestStudent3{
    public static void main(String[] args[]){
        Student student_1 = new Student();
        Student student_2 = new Student();

        // initializing
        student_1.id = 101;
        student_2.id = 102;

        student_1.name = "John";
        student_2.name = "Mary";

        // print data
        System.out.println(student_1.id + " " + student_1.name);
        System.out.println(student_2.id + " " + student_2.name);
    }
}