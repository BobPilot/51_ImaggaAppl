package dto;

import java.util.Arrays;

public class InfoDTO {

    private ColorsDTO [] background_colors;
    private ColorsDTO [] image_colors;
    private ColorsDTO [] foreground_colors;

    public ColorsDTO[] getBackground_colors() {
        return background_colors;
    }

    public ColorsDTO[] getImage_colors() {
        return image_colors;
    }

    public ColorsDTO[] getForeground_colors() {
        return foreground_colors;
    }

    @Override
    public String toString() {

        String tableFormat = "\nCOLOR NAME\t\tPARENT COLOR NAME\t\tCOVERAGE PERSENT\n";

        StringBuilder sb = new StringBuilder();
        sb.append(tableFormat);

        sb.append(colorToString(background_colors));
        sb.append(colorToString(image_colors));
        sb.append(colorToString(foreground_colors));

        return sb.toString();
    }

    private String colorToString(ColorsDTO[] colors) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < colors.length; i++) {
            sb.append(colors[i]);
        }
        return sb.toString();
    }
}
