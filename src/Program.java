import java.util.Arrays;
/*
Створіть enum Посади, яке відповідає можливій структурі посад підприємства.
Продемонструйте  можливість задавати властивості, конструктори та методи в enum.
Забезпечте при цьому можливості змінювати посадові оклади та кількість днів відпустки.
 */
enum Positions{

    Recruit(440,0),
    Soldier(600,0),
    Old_Soldier(700,0),
    Young_Sergeant(750,30),
    Sergeant(800,60),
    Old_Sergeant(880,80),
    First_Sergeant(950,90),
    Header_Sergeant(1000,100),
    Starshina(3000,120),
    Ensign(4000,120),
    Header_Ensign(4500,124);
    private int salary;
    private int days_vacation;
    Positions(int salary,int days_vacation){
        this.salary=salary;
        this.days_vacation=days_vacation;
    }

    void setDays_vacation(int days_vacation) {
        this.days_vacation = days_vacation;
    }

    int getDays_vacation() {
        return days_vacation;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "salary=" + salary +
                ", days_vacation=" + days_vacation +
                '}';
    }
}
/*
Продемонструйте спадкування інтерфейсів Спортивний(методи тренуватися,змагатися) та Олімпійський(приймати участь у відкритті та закритті Олімпіад).
Створіть відповідні класи Борець та Шахіст які імплементують ці інтерфейси.
Покажіть приклад поліморфізму на підставі інтерфейсів.
 */
interface Sportaclly{
public int Competition(int sportsman_speed,int sportsman_power,int sportsman_intellect,int comaption_time);
default  int Training(String[]day,int[]time,int energy){
    return 0;
}

    public default int Win(){
        return 0;
    }
}
String []
interface Olimpic extends Sportaclly{
boolean Participate_start();
boolean Participate_end(int last_result,int middle_points);

}
class Fighter implements  Sportaclly,Olimpic {




    @Override
public int Competition(int sportsman_speed,int sportsman_power,int sportsman_intellect,int comaption_time) {
        comaption_time = 1;
        for (int i = 0; i < comaption_time; i++) {
            int rand = (int) (Math.random() + 1);
            if (rand != 0) {
                comaption_time++;
                sportsman_intellect++;
                sportsman_power++;
                sportsman_intellect++;
            }
        }
        return (sportsman_intellect+sportsman_power+sportsman_speed)/comaption_time;

    }
    @Override
public boolean Participate_start(){
    return true;

}
@Override
public boolean Participate_end(int last_result,int middle_points){
    if(last_result>=middle_points){
        return true;
    }
    else {
        return false;
    }
}
}
class Chesser implements Olimpic{
    @Override
    public int Competition(int sportsman_speed,int sportsman_power,int sportsman_intellect,int comaption_time) {
        comaption_time = 1;
        for (int i = 0; i < comaption_time; i++) {
            int rand = (int) (Math.random()*2);
            if (rand != 0) {
                comaption_time++;
                sportsman_intellect++;
                sportsman_intellect++;
            }
        }
        return (sportsman_intellect+sportsman_speed)/comaption_time;

    }
    @Override
    public int Training(String[] day, int[] time, int energy) {
        int intellect=0;

        for(int i=0;i<time.length;i++){
            intellect+=day.length/time[i];
            energy--;
            if(energy<=0){
                break;
            }
        }
        return intellect;
    }
    @Override
    public boolean Participate_start(){
        return true;

    }
    @Override
    public boolean Participate_end(int last_result,int middle_points) {
        if (last_result >= middle_points) {
            System.out.println("(He or She) made it to the final(end)");
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int Win(){
        return 0;
    }
}

public class Program {
    public int Calculate(int theValue) throws Exception {
        if( theValue < 0){
            throw new Exception("Параметр для вычисления не должен быть отрицательным");
        }
        return 0;
    }

    public static void main(String [] arg) throws Exception {
        Chesser sportsman1=new Chesser();
        Olimpic sportsman2=new Chesser();
        Fighter fighter1=new Fighter();
        Teacher teacher1=new Teacher(165,"Юрий");
        Student student1=new Student(2,"Kicko");
        int[]time={1,2,3,4};
        Student2 student2=new Student2(12,"male",156,"Moll","Dart",5);
        Student student3=new Student("Sashko","Evdokimov");
        Program program=new Program();
        String[]days={"friday,monday,thursday,sunday"};
        Positions arm1=Positions.Header_Sergeant;
        arm1.setDays_vacation(125);
        arm1.setSalary(3000);

/*
Продемонструйте у коді перехоплення у блоці  try-catch декількох виключень,
покажіть, як ієрархія спадкування виключень, впливає на порядок перехоплення виключень у багаторядковому блоці catch
 */
        int x=0;
        try {

            try {
                throw new StackOverflowError("please don't touch me");
            }

            finally {
                System.out.println("hello finally");
            }

        }
        catch (ArrayIndexOutOfBoundsException error){
            for (int i=0;i<time.length;i++) {
                time[i] = 2;
            }

        }
        catch (Throwable ex){

        }
String []hello;
        System.out.println(arm1);
        System.out.println(student3.toString());
        System.out.println(student2.Grow(student2));
        student1.setWidth(time);
        sportsman2.Win();
        sportsman2.Training(days,time,5);
        System.out.println(student1.getWidth());
        System.out.println(fighter1.Training(days,time,5));
        System.out.println(sportsman2.Participate_end(sportsman1.Competition(2,2,sportsman1.Training(days,time,5),0),2));
    }
}