public class Human {
    String name;
    int yearOfBirth;
    String city;
    String jobTitle;

    public Human(String name, int yearOfBirth, String city, String jobTitle) {
        if (name == null || name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (city == null || city.equals("")) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (jobTitle == null || jobTitle.equals("")) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }
}
