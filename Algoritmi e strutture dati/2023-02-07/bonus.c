#include "bonus.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h> // per uint8_t

BonusWrapper_T *create_bonus_wrapper(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        return NULL;
    }

    BonusWrapper_T * wrapper = malloc(sizeof(BonusWrapper_T));
    if(wrapper == NULL) {
        fclose(file);
        return NULL;
    }

    // Leggi la dimensione N
    fscanf(file, "%d", &wrapper->N);
    wrapper->bonuses = malloc(wrapper->N * sizeof(Bonus_T));

    for (int i = 0; i < wrapper->N; i++) {
        fscanf(file, "%d %d", &(wrapper->bonuses[i].N), &(wrapper->bonuses[i].score));
        wrapper->bonuses[i].sequence = malloc(wrapper->bonuses[i].N * sizeof(uint8_t));
        for(int j = 0; j < wrapper->bonuses[i].N; j++) {
            unsigned int temp;              // %x legge in un int
            fscanf(file, "%x", &temp);
            wrapper->bonuses[i].sequence[j] = (uint8_t)temp;  // conversione sicura in 0–255
            wrapper->bonuses[i].taken = 0;
        }
    }

    fclose(file);
    return wrapper;
}

void free_bonus_wrapper(BonusWrapper_T * wrapper) {
    if (wrapper != NULL) {
        for(int i = 0; i < wrapper->N; i++) {
            free(wrapper->bonuses[i].sequence);
        }
        free(wrapper->bonuses);
        free(wrapper);
    }
}