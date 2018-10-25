package tk.arktech;

import java.text.ParseException;
import java.util.Scanner;

public class PointParser extends Parser {

    @Override
    public Object handle(Scanner sc) {

        if(sc.hasNext("[Pp]oint"))
        {
            sc.next();
            int x = 0;
            if(sc.hasNextInt())
            {
                x = sc.nextInt();
            }
            else
            {
                try {
                    throw new ParseException("Niepoprawny format punktu", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            int y = 0;
            if(sc.hasNextInt())
            {
                y = sc.nextInt();
            }
            else
            {
                try {
                    throw new ParseException("Niepoprawny format punktu", sc.match().start());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            return new Point(x, y);

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
