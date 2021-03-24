public class Lesson6 {
    public static void main(String[] args)
    {
        int season = 7;

        switch (season) {
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
            default:
                System.out.println("A to ciekawe, nowa pora roku");
        }
    }
}
