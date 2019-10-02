import java.util.Scanner;
public class Controller {
    Scanner scanner;

    public Controller() {
        scanner = new Scanner(System.in);
    }

    public String umur() {
        String result = "";
        while (true) {
            System.out.print("\n\nApakah tua? ");
            int old = scanner.nextInt();
            if (old == 0) {
                System.out.print("Apakah muda? ");
                int young = scanner.nextInt();
                if (young == 0) {
                    System.out.print("Apakah paruh baya? ");
                    int middle = scanner.nextInt();
                    if (middle == 1)
                        result = "Paruh Baya";
                } else
                    result = "Muda";
            } else
                result = "Tua";
            if (!result.equals(""))
                break;
        }
        return result;
    }

    public String kegemukan() {
        String result = "";
        while (true) {
            System.out.print("\n\nApakah terlalu gemuk? ");
            int too = scanner.nextInt();
            if (too == 0) {
                System.out.print("Apakah sangat gemuk? ");
                int so = scanner.nextInt();
                if (so == 0) {
                    System.out.print("Apakah gemuk? ");
                    int fat = scanner.nextInt();
                    if (fat == 1)
                        result = "Gemuk";
                } else 
                    result = "Sangat Gemuk";
            } else
                result = "Terlalu Gemuk";
            if (!result.equals(""))
                break;
        }
        return result;
    }

    public void judul() {
        System.out.println("Klasidikasi dengan Naive Bayes");
        System.out.println("     PENYAKIT HIPERTENSI");
        System.out.println("==============================");
    }

}