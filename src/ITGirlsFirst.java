import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

public class ITGirlsFirst {
    public static void main (String[] args) {
        String x="Training Java";
        System.out.println(x.length());
        System.out.println(x.charAt(5));
        LocalDate d = LocalDate.now();
        System.out.println(x+" "+d);

        /*int b=50;
        int c=20;
        System.out.println(++b);
        System.out.println(--c);
        System.out.println(b >= 51 || c < 22);

        int a=5;
        int b=8;
        int s=(a*b)/2;
        double c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double p=a+b+c;
        boolean d=p>15;
        boolean e=s<30;
        System.out.println("площадь равна "+s+" периметр равен "+p);
        System.out.println("Периметр больше 15? " + d + " Площадь меньше 30? " +e);
        String x="Hello IT Girls";
        System.out.println(x);
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+isNew);
        //Задайте для переменной byte, short, float значения, выходящие за диапазон их
        // максимальных. Проанализируйте возникшие ошибки.
        //byte j=128;
        //byte X=-129;
        //short y=32768;
        //short Y=-32769;
        //float z=3.4E+39F;
        //float Z=-3.4E+39F;
        char a='ы';//По значению символа
        char b=1067;//По индексу символа в таблице UTF-8
        char c= '\u042B';//Через шестнадцатеричную форму Unicode
        System.out.println(a+" "+b+" "+c);
        //Напечатайте любую строку, используя объявление переменной типа String.
        // Объявите её двумя разными способами, описанными в главе.
        String string1 = "I am a string :-)";
        String string2 = new String("I am a string too :-P");
        System.out.println(string1+" "+string2);

        byte a=1;
        Byte aboxed;
        aboxed = new Byte (a);
        short b=22;
        Short bboxed;
        bboxed= Short.valueOf(b);
        int c=1;
        Integer cboxed;
        cboxed = c;
        long d=3000L;
        Long dboxed;
        dboxed = new Long(d);
        float e= 33.56F;
        Float eboxed;
        eboxed=Float.valueOf(e);
        double f=3.45;
        Double fboxed;
        fboxed = f;
        char g='g';
        Character gboxed;
        gboxed = Character.valueOf(g);
        boolean isNew=true;
        Boolean isBoxed;
        isBoxed = isNew;*/
    }
}
