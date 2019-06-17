import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class PaginatorTest {
    Paginator paginator;

    @Test
    public  void small_text_big_page_length () {
        paginator = new Paginator(160);
        String a = "Tekst do testów";
        List<String> b = paginator.paginate(a);
        assertEquals(1,b.size());
        assertEquals(a,b.get(0));
    }
    @Test
    public  void big_text_small_page_length () {
        paginator = new Paginator(5);
        String c = "11111222223333344444pppppyyy";
        List<String> d = paginator.paginate(c);
        assertEquals(6, d.size());
        assertEquals("11111", d.get(0));
        assertEquals("22222", d.get(1));
        assertEquals("33333", d.get(2));
        assertEquals("44444" ,d.get(3));
        assertEquals("ppppp", d.get(4));
        assertEquals("yyy",d.get(5));

    }

}
