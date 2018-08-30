package dto;

import java.text.DecimalFormat;

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
                + (percentage + percent) + "\n";                    
    }


    private String tableFormat (String word){

        int size = 20;
        int plus = size - word.length();

        StringBuilder newWord = new StringBuilder(word);

        for (int i = 0; i < plus; i++) {
            newWord.append(" ");
        }

        return newWord.toString();
    }
}
