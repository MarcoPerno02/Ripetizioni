#include <stdio.h>
#include <stdlib.h>
#include "Sinergia.h"

typedef struct dipendente_t *DIPENDENTE;

DIPENDENTE DIPENDENTEinit(int maxN);
DIPENDENTE DIPENDENTEload(FILE *f);
void DIPENDENTEfree(DIPENDENTE D);
