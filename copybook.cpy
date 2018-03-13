12345678901234567890123456789012345678901234567890123456789012345678901234567890
123456******************************************************************12345678
123456* NAME   : COPYBOOK                                              *12345678
123456* LENGTH : 100                                                   *12345678
123456* DESCRIPTION: COPYBOOK EXAMPLE                                  *12345678
123456******************************************************************12345678
       01          COPYBOOK.
         03        NAME-BOOK           PIC X(50) VALUE SPACES.
      *            USER NAME 
         03        PERSON-TYPE-BOOK    PIC X(01) VALUE SPACES.
      *            PERSON TYPE
      *            - F: FISIC PERSON
      *            - J: JURIDIC PERSON
         03        CNPJ-BOOK.
      *            CNPJ NUMBER
           05      ROOT-CNPJ-BOOK      PIC 9(08) VALUE ZEROS.
           05      BRANCH-BOOK         PIC 9(04) VALUE ZEROS.
           05      DAC-BOOK            PIC 9(02) VALUE ZEROS.
         03        CPF-BOOK            REDEFINES
                   CNPJ-BOOK.
      *            CPF NUMBER
           05      FILLER              PIC X(03).
           05      NUMBER-BOOK         PIC 9(09).
           05      DAC-BOOK            PIC 9(02).
         03        FILLER              PIC X(35).