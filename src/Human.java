public class Human {
    public int age;
    public String name;
    public String city;

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
}
