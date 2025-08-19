#include "grid.h"
#include "bonus.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h> // per uint8_t

grid_T *create_grid(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        return NULL;
    }

    grid_T *grid = malloc(sizeof(grid_T));
    if (grid == NULL) {
        fclose(file);
        return NULL;
    }

    // Leggi la dimensione N
    fscanf(file, "%d", &grid->N);

    // Alloca la griglia
    grid->cells = malloc(grid->N * sizeof(uint8_t *));
    for (int i = 0; i < grid->N; i++) {
        grid->cells[i] = malloc(grid->N * sizeof(uint8_t));
        for (int j = 0; j < grid->N; j++) {
            unsigned int temp;              // %x legge in un int
            fscanf(file, "%x", &temp);
            grid->cells[i][j] = (uint8_t)temp;  // conversione sicura in 0–255
        }
    }

    fclose(file);
    return grid;
}


void free_grid(grid_T *grid) {
    if (grid != NULL) {
        for (int i = 0; i < grid->N; i++) {
            free(grid->cells[i]);
        }
        free(grid->cells);
        free(grid);
    }
}


void print_sequence(uint8_t *seq, int k) {
    for (int i = 0; i < k; i++) {
        printf("%02X ", seq[i]);  // stampa in esadecimale
    }
    printf("\n");
}

// ritorna 1 se è valida, altrimenti 0
int verify_substring_in_grid(substring, len_substring, grid) {
    // 
    int i = 0, j = 0, k = 0;
    while()
}

void generate_substrings_to_verify(uint8_t * string, int len_string, int len_substring, grid_T * grid, BonusWrapper_T * bonus_wrapper) {
    for(int i = 0; i <= len_string - len_substring; i++) {
        uint8_t substring [len_substring];
        for(int k = 0; k < len_substring; k++) {
            substring[k] = string[i + k];
        }
        print_sequence(substring, len_substring);

        verify_substring_in_grid(substring, len_substring, grid);
    }
}

int check_solution(grid_T * grid, BonusWrapper_T * wrapper, uint8_t * solution, int len_solution) {
    printf("Tutte le disposizioni:\n");
    for(int j = 1; j <= len_solution; j++) {
        generate_substrings_to_verify(solution, len_solution, j, grid, wrapper);
    }
    printf("-----------------\n");
    
    
    int final_score = 0;
    for(int i = 0; i < wrapper->N; i++) {

        
    }
}