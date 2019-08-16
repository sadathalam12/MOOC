import java.util.Calendar;

public class Person {
    
    private String name;
    private MyDate birthday;
   
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);     
    }
    
    public int age() {
    // calculate the age based on the birthday and the current day
    // you get the current day as follows: 
        int currentDate = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth= Calendar.getInstance().get(Calendar.MONTH) + 1; 
        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        MyDate dateNow = new MyDate(currentDate,currentMonth,currentYear);
        
        return dateNow.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        int age1 = this.age(); 
        int age2 = compared.age(); 
        int differenceOfAge= age1-age2; 
        
        return differenceOfAge > 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
