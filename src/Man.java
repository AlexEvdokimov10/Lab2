// Продемонструйте вплив модифікатора final на різні структурні частини коду на прикладі ієрархії Людина, Студент
public abstract class Man {
    int age;
    String gender;
    int height;
    final String name;
    final String surname;

    public Man(int age, String gender, int height, String name,String surname){

        this.surname=surname;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;

    }

    final String Grow(Man obj){
        age++;
        height++;

        return "Age: "+age+" Name: "+name+" Gender:"+gender+" Height: "+height;
    }

}
final class Student2 extends Man{
    int assessment;

public Student2(int age,String gender,int height,String name,String surname,int assessment){
    super(age,gender,height,name,surname);
    this.assessment=assessment;
}


    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }
}

