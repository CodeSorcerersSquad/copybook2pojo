package conversor.domain;

import conversor.annotations.MainframeBook;
import conversor.annotations.MainframeField;
import conversor.annotations.MainframeFiller;

@MainframeBook(length = 60)
@MainframeFiller(afterOrder = 2, length = 8, fillerChar = 'Z')
public class Child {

    @MainframeField(order = 1, length = 50)
    private String name;

    @MainframeField(order = 2, length = 2)
    private Integer years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
