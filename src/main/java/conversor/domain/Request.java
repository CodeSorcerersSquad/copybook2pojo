package conversor.domain;

import conversor.annotations.MainframeBook;
import conversor.annotations.MainframeField;
import conversor.annotations.MainframeFiller;
import conversor.annotations.MainframeFillers;

@MainframeBook(length = 150)
@MainframeFillers({
        @MainframeFiller(beforeOrder = 3, length = 15, fillerChar = 'X'),
        @MainframeFiller(afterOrder = 4, length = 50, fillerChar = 'Y')
})
public class Request {

    @MainframeField(order = 1, length = 50)
    private String name;

    @MainframeField(order = 2, length = 1)
    private char personType;

    @MainframeField(order = 3, length = 14)
    private Long cpfcnpj;

    @MainframeField(order = 4, length = 50)
    private String email;

    public Request () {}

    public Request (String name, char personType, Long cpfcnpj, String email) {
        setName(name);
        setPersonType(personType);
        setCpfcnpj(cpfcnpj);
        setEmail(email);
    }

    public String getNome() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPersonType() {
        return this.personType;
    }

    public void setPersonType(char personType) {
        this.personType = personType;
    }

    public Long getCpfcnpj() {
        return this.cpfcnpj;
    }

    public void setCpfcnpj(Long cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}