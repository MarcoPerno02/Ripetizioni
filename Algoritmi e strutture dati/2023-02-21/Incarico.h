#include <stdio.h>
#include <stdlib.h>

typedef struct incarico_t *INCARICO;

INCARICO INCARICOinit(int maxN);
INCARICO INCARICOload(FILE *f);
void INCARICOfree(INCARICO D);