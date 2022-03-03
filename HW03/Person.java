public class Person {
    private String name;
    private Month birthMonth;
    private Day birthDay;
    private int birthYear;

    public Person(String name, Month birthMonth, Day birthDay, int birthYear) {
        this.name = name;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    //unused function - was going to use to auto-sort presidents array
    public boolean isOlderThan(Person p2) {
        if (this.birthYear < p2.getBirthYear())
            return true;
        else if (this.birthYear > p2.getBirthYear())
            return false;
        else
            if (Month.isLessThan(this.birthMonth, p2.getBirthMonth()))
                return true;
            else if (Month.isGreaterThan(this.birthMonth, p2.getBirthMonth()))
                return false;
            else
                if (Day.isLessThan(this.birthDay, p2.getBirthDay()))
                    return true;
                else
                    return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Month birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Day getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Day birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
