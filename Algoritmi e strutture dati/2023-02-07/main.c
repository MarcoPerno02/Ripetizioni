#include "grid.h"
#include "bonus.h"
#include <stdio.h>
#include <stdlib.h>

int main() {
    grid_T *grid = create_grid("grid.txt");
    BonusWrapper_T * wrapper = create_bonus_wrapper("bonus.txt");
    
    if (grid == NULL) {
        return 1;
    }

    // Use the grid...
    uint8_t solution[] = { 0xAA, 0xEE, 0x00 };
    check_solution(grid, wrapper, solution, 3);

    free_grid(grid);
    free_bonus_wrapper(wrapper);
    return 0;
}