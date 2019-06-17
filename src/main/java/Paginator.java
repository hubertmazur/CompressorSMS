import java.util.ArrayList;
import java.util.List;

public class Paginator {

    private  int pageLength ;

    public Paginator(int pageLength) {
        this.pageLength = pageLength;
    }

    public List<String> paginate (String text){
        char [] chars = text.toCharArray();
        List<String> chunks = new ArrayList<>();
        int counter = 0;
        StringBuilder currentMessage = new StringBuilder();
        for (char letter : chars) {
            if (counter >= pageLength) {
                counter = 1 ;
                chunks.add(currentMessage.toString());
                currentMessage = new StringBuilder();
            }
            else {
                counter++;
            }
            currentMessage.append(letter);
        }
        if (currentMessage.length() > 0) {
            chunks.add(currentMessage.toString());
        }
        return  chunks;
    }
}
