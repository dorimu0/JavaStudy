package Study.src.class1;

public class TelevisionTest {
    public static void main(String arg[]){
        Television myTV = new Television();

        // myTV.channel = 7;
        // myTV.volume = 9;
        // myTV.isOn = true;
        // +
        myTV.inputData(7, 9, true);
        myTV.print();

        Television yourTV = new Television();

        yourTV.channel = 9;
        yourTV.volume = 12;
        yourTV.isOn = true;
        yourTV.print();
    }
}
