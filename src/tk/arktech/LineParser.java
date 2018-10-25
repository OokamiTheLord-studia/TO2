package tk.arktech;

import java.text.ParseException;
import java.util.Scanner;

public class LineParser extends Parser {

    @Override
    public Object handle(Scanner sc) {
        if(sc.hasNext("[Ll]ine"))
        {
            Point start = null;
            if(sc.hasNext("[Pp]oint"))
            {
                Object tmp = this.handle(sc);
                if(tmp instanceof Point)
                {
                    start = (Point) tmp;
                }
                else
                {
                    try {
                        throw new ParseException("Błąd parsowania pierwszego pkt linii", sc.match().start());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
            Point end = null;
            if(sc.hasNext("[Pp]oint"))
            {
                Object tmp = this.handle(sc);
                if(tmp instanceof Point)
                {
                    end = (Point) tmp;
                }
                else
                {
                    try {
                        throw new ParseException("Błąd parsowania drugiego pkt linii", sc.match().start());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }

            if(sc.hasNextFloat())
            {
               return new Line(start, end, sc.nextFloat());
            }
            else
            {
                return new Line(start, end);
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
