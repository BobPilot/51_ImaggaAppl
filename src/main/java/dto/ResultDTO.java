package dto;

import java.net.URI;

public class ResultDTO {

    InfoDTO info;

    public InfoDTO getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return info.toString();
    }
}
