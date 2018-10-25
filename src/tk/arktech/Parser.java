package tk.arktech;

import java.util.Scanner;

public abstract class Parser {
    protected Parser next = null;

    public Parser add(Parser p )
    {
        this.next = p;
        return p;
    }

    public abstract Object handle(Scanner sc);


}
