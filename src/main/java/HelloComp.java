public class HelloComp {
    public static void main(String[] args) {
        final int hour = 19;
        final int dayWeek = 6;

        if ((hour > 0 && hour < 8) && (dayWeek >= 1 && dayWeek <= 5)) {
            System.out.println("Доброе утро!");
        } else if (((hour > 8) && (hour <= 11)) && (dayWeek >= 1 && dayWeek <= 5)) {
            System.out.println("Всё пропало ты проспал!");
        } else if ((dayWeek >= 1 && dayWeek <= 5) && (hour > 11)) {
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул!");
        } else if ((hour > 0 && hour <= 12) && (dayWeek == 6 || dayWeek == 7)) {
            System.out.println("Доброе утро!");
        } else if ((hour > 12) && (hour <= 16) && (dayWeek == 6 || dayWeek == 7)) {
            System.out.println("Лучше поспать ещё!");
        } else if ((hour > 16) && (hour <= 18) && (dayWeek == 6 || dayWeek == 7)) {
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
        } else if ((hour > 18) && (dayWeek == 6 || dayWeek == 7)) {
            System.out.println("Дааа, с режимом надо что-то делать!");
        }
    }
}

