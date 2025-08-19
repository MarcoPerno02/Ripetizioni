#ifndef GRID_H
#define GRID_H
#include <stdint.h> // per uint8_t
#include "bonus.h"

typedef struct grid_T
{
    int N;
    uint8_t **cells;
} grid_T;

grid_T *create_grid(const char *filename);
void free_grid(grid_T *grid);
int check_solution(grid_T * grid, BonusWrapper_T * wrapper, uint8_t * solution, int len_solution);
#endif // GRID_H