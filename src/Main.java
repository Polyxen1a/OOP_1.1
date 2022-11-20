public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;


        Human maksim = new Human(35, "Максим","Минск","бренд-менеджер");
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.city = "Минск";
        maksim.post = "бренд-менеджер";

        Human anya = new Human(29,"Аня","Москва","методист образовательных программ");
        anya.name = "Аня";
        anya.age = 29;
        anya.city = "Москва";
        anya.post = "методист образовательных программ";

        Human katya = new Human(28,"Катя","Калининград","продакт-менеджер");
        katya.name = "Катя";
        katya.age = 28;
        katya.city = "Калининград";
        katya.post = "продакт-менеджер";

        Human artem = new Human(27,"Артем","Москва","директор по развитию бизнеса");
        artem.name = "Артем";
        artem.age = 27;
        artem.city = "Москва";
        artem.post = "директор по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.city + ". Я родился в " + (currentYear - maksim.age) + " году. Я работаю на должности " + maksim.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.city + ". Я родился в " + (currentYear - anya.age) + " году. Я работаю на должности " + anya.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city + ". Я родился в " + (currentYear - katya.age) + " году. Я работаю на должности " + katya.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.city + ". Я родился в " + (currentYear - artem.age) + " году. Я работаю на должности " + artem.post + " Будем знакомы!");
    }
}