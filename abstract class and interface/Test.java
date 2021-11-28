public class Test {
    public static void main(String[] args){
        Pen reynolds = new Reynolds();
        Pen jetter = new Jetter();
        reynolds.use();
        jetter.use();
        reynolds.color();
        jetter.color();
    }
}
