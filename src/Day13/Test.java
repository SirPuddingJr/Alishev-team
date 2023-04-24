package Day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMassage(user2, "Прифет для юзер 1!");
        user1.sendMassage(user2, "Как дела ?");

        user2.sendMassage(user1, "Здравствуй юзер1!");
        user2.sendMassage(user1, "Я юзер 2, приятно познакомится.");
        user2.sendMassage(user1, "Я ЗБС, как ты?");

        user3.sendMassage(user1, "Прифет, мое имя юзер3.");
        user3.sendMassage(user1, "Помнишь меня?");
        user3.sendMassage(user1, "Мы ходили в одну школу.");

        user1.sendMassage(user3, "Прифет, Юзер3, КНШ я тебя помню.");
        user1.sendMassage(user3, "Рад тебя снова видеть");
        user1.sendMassage(user3, "Может завтра по пивку?");

        user3.sendMassage(user1, "Хорошо, я как раз завтра свободен.");

        MassageDatabase.showDialog(user1, user3);
    }
}
