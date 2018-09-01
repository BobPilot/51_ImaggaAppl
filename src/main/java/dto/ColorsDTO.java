package dto;

import java.text.DecimalFormat;

import static controller.ColorAppl.tableFormat;

public class ColorsDTO {

    private String closest_palette_color_parent;
    private String closest_palette_color;
    private double percentage;
    private double percent;

    public String getClosest_palette_color_parent() {
        return closest_palette_color_parent;
    }

    public String getClosest_palette_color() {
        return closest_palette_color;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {

        return tableFormat(closest_palette_color)
                + tableFormat(closest_palette_color_parent)
                + (percent + percentage) + "\n";
    }

}