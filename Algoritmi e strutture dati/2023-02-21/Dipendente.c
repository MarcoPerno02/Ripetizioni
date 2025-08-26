#include "Dipendente.h"

typedef struct dipendente{
    int id;
    int esperienza;
} *Dipendente;

struct dipendente_t{
    Dipendente d;
    int N;
};

DIPENDENTE DIPENDENTEinit(int maxN){
    DIPENDENTE D = malloc(sizeof*D);
    D->d = malloc(maxN*sizeof(Dipendente));
    D->N = 0;
    return D;
}

DIPENDENTE DIPENDENTEload(FILE *f){
    int i, p;
    fscanf(f, "%d", &p); //Leggo il numero di dipendenti da file

    DIPENDENTE D = DIPENDENTEinit(p);
    
    for(i = 0; i < p; i++){
        D->d[i].id = i;
        fscanf(f, "%d", &(D->d[i].esperienza));
        D->N++;       
    }
    return D;
}

void DIPENDENTEfree(DIPENDENTE D){
    free(D->d);
    free(D);
}