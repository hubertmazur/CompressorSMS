import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NaiveCompressorTest {

    NaiveCompressor naiveCompressor;


    @Before
    public  void setup () {
        naiveCompressor = new NaiveCompressor();
    }

    @Test
    public void simple_string_compression () {
      String compressed = naiveCompressor.compress("Pies ma Ale");
        assertEquals("PiesMaAle", compressed);
        String decompressed = naiveCompressor.decompress(compressed);
        assertEquals("Pies Ma Ale", decompressed);
    }

    @Test
    public void complex_string_compression () {
        String compressed = naiveCompressor.compress("Ola mA koTa a Iza ma Psa");
        assertEquals("OlaMAKoTaAIzaMaPsa", compressed);
       String decompressed = naiveCompressor.decompress(compressed);
       assertEquals("Ola M A Ko Ta A Iza Ma Psa", decompressed);

    }

}
