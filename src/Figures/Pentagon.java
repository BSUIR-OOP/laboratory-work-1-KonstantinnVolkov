package Figures;

import Figures.Figures;

public class Pentagon extends Figures {

    public Pentagon(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    @Override
    public void output() {
        super.output();
        System.out.println("⬟");
    }
}
