#include <stdio.h>
#include <stdlib.h>

typedef struct sinergia_t *SINERGIA;

SINERGIA SINERGIAinit(int maxN);
SINERGIA SINERGIAload(FILE *f);
void SINERGIAfree(SINERGIA S);