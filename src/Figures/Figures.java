package Figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Figures {

    private static final List<Figures> figures = new ArrayList<>();

    static {
       figures.add(new Trapezium(1, 2, 3, 4) );
       figures.add(new Rectangle(5, 6, 7, 8) );
       figures.add(new Star(9, 10 ,11, 12) );
       figures.add(new Pentagon(13, 14, 15, 16) );
       figures.add(new Triangle(17, 18, 19, 20) );
       figures.add(new Circle(21, 22, 23, 24) );
    }

    private final double x1;
    private final double x2;
    private final double y1;
    private final double y2;
    private final String nameOfFigure;

    public Figures(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.nameOfFigure = getClass().getName();
    }

    public static void printAllFigures() {
        figures.forEach(figure -> figure.output());
    }

    public void output(){
        System.out.printf("%s (%2.1f, %2.1f, %2.1f, %2.1f)",nameOfFigure, x1, y1, x2, y2);
    }

}
