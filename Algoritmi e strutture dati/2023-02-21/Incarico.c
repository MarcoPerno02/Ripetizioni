#include "Incarico.h"

typedef struct incarico{
    int id;
    int difficolta;
} *Incarico;

struct incarico_t{
    Incarico i;
    int N;
};

INCARICO INCARICOinit(int maxN){
    INCARICO I = malloc(sizeof*I);
    I->i = malloc(maxN*sizeof(Incarico));
    I->N = 0;
    return I;
}

INCARICO INCARICOload(FILE *f){
    int i, t;
    fscanf(f, "%d", &t);

    INCARICO I = INCARICOinit(t);
    
    for(i = 0; i < t; i++){
        I->i[i].id = i;
        fscanf(f, "%d", &I->i[i].difficolta);
        I->N++;       
    }
    return I;
}

void INCARICOfree(INCARICO I){
    free(I->i);
    free(I);
}