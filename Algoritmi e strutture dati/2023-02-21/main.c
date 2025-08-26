#include <stdio.h>
#include <stdlib.h>
#include "Sinergia.h"
#include "Dipendente.h"
#include "Incarico.h"

int main(){
    DIPENDENTE D;
    SINERGIA S;
    INCARICO I;

    FILE *f = fopen("dipendenti.txt", "r");
    D = DIPENDENTEload(f);
    fclose(f);

    f = fopen("sinergia.txt", "r");
    S = SINERGIAload(f);
    fclose(f);

    f = fopen("incarico.txt", "r");
    I = INCARICOload(f);
    fclose(f);
    
    return 0;
}