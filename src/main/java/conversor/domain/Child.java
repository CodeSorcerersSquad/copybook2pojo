package src.main.java.conversor.domain;

import src.main.java.conversor.annotations.MainframeBook;
import src.main.java.conversor.annotations.MainframeField;
import src.main.java.conversor.annotations.MainframeFiller;

@MainframeBook(length = 60)
@MainframeFiller(afterOrder = 2, length = 8, fillerChar = 'Z')
public class Child {

    @MainframeField(order = 1, length = 50)
    private String name;

    @MainframeField(order = 2, length = 2)
    private Integer years;

}
