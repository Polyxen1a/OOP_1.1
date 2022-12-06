public class Human {
    private int age;
    public String name;
    private String city;

    public String post;

    public Human(int age, String name, String city, String post) {
        if (age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name == null) {
            this.name = "Информаация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информаация не указана";
        } else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информаация не указана";
        } else {
            this.post = post;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) {
            this.city = "Информаация не указана";
        } else {
            this.city = city;
        }
    }

}
