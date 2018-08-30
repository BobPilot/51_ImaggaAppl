package dto;

import java.util.Arrays;

public class ResponseDTO {

    ResultDTO[] results;
    ErrorDTO [] unsuccessful;

    public ErrorDTO[] getUnsuccessful() {
        return unsuccessful;
    }

    public ResultDTO[] getResults() {
        return results;
    }

    @Override
    public String toString() {

        if(results.length == 0){
            return unsuccessful[0].toString();
        } else {
            return results[0].toString();
        }
    }
}
