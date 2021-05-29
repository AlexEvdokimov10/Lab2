import java.lang.reflect.Array;
import java.util.Arrays;
/*
Створіть просту  ієрархію спадкування, яка відповідає сутностям Людина, Студент, Викладач з відповідними властивостями.
Продемонструйте перевантаження конструкторів та методів, перевизначення методів, особливості роботи конструкторів при спадкуванні.
 */
abstract class Hut{

}
public abstract class Human {
    String name;
    String surname;
    int height;

    Human(int height,String name,String surname){
        this.height=height;
        this.name=name;
        this.surname=surname;
    }
    Human(int height,String name){
        this.height=height;
        this.name=name;
    }
    Human(int height){
        this.height=height;
    }



    public abstract void setWidth(int[] temp);

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                '}';
    }
}
class Student extends Human{

    private int[] assessment;
    Student(int height,String name){
        super(height,name);
    }
    Student(String name,String surname){
        this(0,name);
    }
    public String getWidth() {
        return Arrays.toString(assessment);
    }
    @Override
    public void setWidth(int[] temp){
        assessment=new int[temp.length];
        for(int i=0;i<assessment.length;i++){
            assessment[i]=temp[i];
        }
    }
}
class Teacher extends Human{
    private int[] assesssment_experience;
    Teacher(int height){
        super(height);
    }
    Teacher(int height,String name){
        super(height,name);
        this.name=name;
    }

    public String getWidth() {
        return Arrays.toString(this.assesssment_experience);
    }

    @Override
    public void setWidth(int[] temp) {
        for(int i=0;i<temp.length;i++){
            assesssment_experience[i]=temp[i];
        }
    }

}