class Student {
    int id;
    String name;
    double[] grades;

    Student(int id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    void display_average_grade() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        System.out.println("The Average of " + name + " ID: " + id + " is " + average);
    }

    double[] calc_percentage() {
        double[] percentage = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            percentage[i] = (grades[i] / 200) * 100;
        }
        return percentage;
    }

    String concat_id_name() {
        return id + " _ " + name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(34, "Hamza", new double[]{184, 198, 177, 188, 194});
        Student student2 = new Student(141, "Saifullah", new double[]{194, 198, 199, 200, 196});

        student1.display_average_grade();
        student2.display_average_grade();

        System.out.println("Persentage of Student 1 " + student1.calc_percentage());
        System.out.println("Persentage of Student 2 " + student2.calc_percentage());

        System.out.println("Concatenated ID and Name for student1: " + student1.concat_id_name());
        System.out.println("Concatenated ID and Name for student2: " + student2.concat_id_name());

    }
}

