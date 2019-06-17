import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz treść smsa:");
        String textMessage = scanner.nextLine();
        System.out.println("Wprowadz maksymalną długlość smsa:");
        int lenght = scanner.nextInt();
        System.out.println("Podaj koszt jednego smsa w PLN-ach: ");
        BigDecimal costOfOneSms = scanner.nextBigDecimal();

        NaiveCompressor naiveCompressor = new NaiveCompressor();
        Paginator paginator = new Paginator(lenght);
        List<String> dividedSMS = paginator.paginate(naiveCompressor.compress(textMessage));
        int amountOfSMS = dividedSMS.size();


        CostCalculator costCalculator = new CostCalculator(costOfOneSms);
        BigDecimal totalCost = costCalculator.calculate(amountOfSMS) ;

        System.out.println(
                String.format("Twoj sms zostanie wysłany w %d wiadomościach," +
                        " całkowity koszt wysłania to %.2f zł. Lista wiadomości: %s", amountOfSMS,totalCost, dividedSMS)
        );

    }
}










