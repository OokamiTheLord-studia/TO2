package tk.arktech;

import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RectangleParser extends Parser {

    @Override
    public Object handle(Scanner sc) {

        if(sc.hasNext(Pattern.compile("[Rr]ectangle")))
        {
            sc.next();
            Point upperLeft = new Point(0,0);
            if(sc.hasNext("[Pp]oint"))
            {
                Object tmp = this.next.handle(sc);
                if(tmp instanceof Point)
                {
                    upperLeft = (Point) tmp;
                }
                else
                {
                    try {
                        throw new ParseException("Błąd parsowania lewego górnego pkt prostokąta", sc.match().start());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

            }
            int width = 0;
            if(sc.hasNextInt())
            {
                width = sc.nextInt();
            }
            else
            {
                try {
                    throw new ParseException("Błąd parsowania szerokości prostokąta", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            int height = 0;
            if(sc.hasNextInt())
            {
                height = sc.nextInt();
            }
            else
            {
                try {
                    throw new ParseException("Błąd parsowania wysokości prostokąta", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            if(sc.hasNextInt())
            {
                return new Rectangle(upperLeft, width, height, sc.nextInt());
            }
            else
            {


                return new Rectangle(upperLeft, width, height);


            }
        }
        else{
            if(this.next != null)
            {
                return this.next.handle(sc);
            }
            else
            {
                try {
                    throw new ParseException("Ostatnie ogniwo nie może sparsować", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }


    }
}
