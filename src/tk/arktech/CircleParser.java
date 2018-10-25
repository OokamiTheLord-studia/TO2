package tk.arktech;

import java.text.ParseException;
import java.util.Scanner;

public class CircleParser extends Parser {

    @Override
    public Object handle(Scanner sc) {

        if(sc.hasNext("[Cc]ircle"))
        {
            sc.next();
            Point center = new Point(0,0);
            if(sc.hasNext("[Pp]oint"))
            {
                Object tmp = this.next.handle(sc);
                if(tmp instanceof Point)
                {
                    center = (Point) tmp;
                }
                else
                {
                    try {
                        throw new ParseException("Błąd parsowania środka okręgu", sc.match().start());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
            else
            {
                try {
                    throw new ParseException("Błędny format okręgu", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            int radius = 0;
            if(sc.hasNextInt())
            {
                radius = sc.nextInt();
            }
            else
            {
                try {
                    throw new ParseException("Błąd parsowania promienia okręgu", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            if(sc.hasNextFloat())
            {
                return new Circle(center, radius, sc.nextFloat());
            }
            else
            {
                return new Circle(center, radius);
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
