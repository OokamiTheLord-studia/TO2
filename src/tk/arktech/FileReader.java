package tk.arktech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private Parser parser;
    private File file;

    public Parser getParser() {
        return parser;
    }

    public FileReader(Parser parser, String filepath) {
        this.parser = parser;
        this.file = new File(filepath);
    }

    public ArrayList<Drawable> startParsing()
    {
        Scanner sc = null;
        ArrayList<Drawable> a = new ArrayList<>();
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(sc!=null)
        {
            sc.useDelimiter(",");
        }

        while(sc != null && sc.hasNext())
        {


            Object tmp = parser.handle(sc);
            if(tmp instanceof Drawable)
            {
                a.add((Drawable) tmp);
            }
        }

        if(sc!= null)
        {
            sc.close();
        }

        return a;
    }
}
