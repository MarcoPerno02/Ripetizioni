#include "Sinergia.h"

struct sinergia_t{
    int **matr;
    int N;
};

SINERGIA SINERGIAinit(int maxN){
    SINERGIA s = malloc(sizeof*s);
    s->matr = (int**)malloc(maxN*sizeof(int*));
    for(int i = 0; i < maxN; i++)
        s->matr[i] = (int*)malloc(maxN*sizeof(int));
    s->N = 0;
}

SINERGIA SINERGIAload(FILE *f){
    int i, j, n;
    fscanf(f, "%d", &n);

    SINERGIA S = SINERGIAinit(n);

    S->N = n;

    for(i = 0; i < n; i++)
        for(j = 0; j < n; j++)
            fscanf(f, "%d", &S->matr[i][j]);

    return S;
}

void SINERGIAfree(SINERGIA S){
    int i;
    for(i = 0; i < S->N; i++)
        free(S->matr[i]);
    free(S->matr);
    free(S);
}