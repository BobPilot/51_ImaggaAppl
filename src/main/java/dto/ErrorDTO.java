package dto;

public class ErrorDTO {

    private String info;
    private String image;

    public String getInfo() {
        return info;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Error: " + info + "\n" +
                "image: " + image + "\nTry again";
    }
}
