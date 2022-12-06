public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;


        Human maksim = new Human(35, "Максим","Минск","бренд-менеджер");

        Human vladimir = new Human(21, "Владимир","Казань",null);

        Human anya = new Human(29,"Аня","Москва","методист образовательных программ");

        Human katya = new Human(28,"Катя","Калининград","продакт-менеджер");

        Human artem = new Human(27,"Артем","Москва","директор по развитию бизнеса");

        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getCity() + ". Я родился в " + human.getAge() + " году. Я работаю на должности " + human.post + " Будем знакомы!");
    }
}