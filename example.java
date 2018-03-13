
@Getter //-> Lombok
@Setter //-> Lombok
@MainframeCopy(length = 100)
class copybook {

    @MainframeParam(order = 1, length = 50)
    private String name;

    @MainframeParam(order = 2, length = 1)
    private char personType;

    @MainframeFillerParam(order = 3, length = 14, fillerChar = ' ')
    private Long filler;

    @MainframeParam(order = 4, length = 14, condition = (copybook t) -> t.personType.equals('F'))
    private Long cnpj;

    @MainframeParam(order = 4, length = 14, condition = (copybook t) -> t.personType.equals('J'), fillerChar = ' ', fillerPosition = FillerPosition.LEFT)
    private Long cpf;


    @MainframeParam(order = 5, length = 1)
    private char email;

}

Joao Silva                                        F   12345678901
JOAO LTDA                                         J12345678123401

