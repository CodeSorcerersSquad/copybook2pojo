package src.main.java.conversor.domain;

import src.main.java.conversor.annotations.*;

import java.util.List;

@MainframeBook(length = 660)
@MainframeFillers({
        @MainframeFiller(afterOrder = 2, length = 8, fillerChar = 'X')
})
public class Response {

    @MainframeField(order = 1, length = 2)
    private Integer returnCode;

    @MainframeField(order = 2, length = 50)
    private String message;

    @MainframeList(order = 3, occurs = 10)
    private List<Child> child;

    public Response () {}

    public Response (Integer returnCode, String message, List<Child> child) {
        setReturnCode(returnCode);
        setMessage(message);
        setChild(child);
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }

}