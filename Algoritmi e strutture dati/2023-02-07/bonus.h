#ifndef BONUS_H
#define BONUS_H
#include <stdint.h> // per uint8_t

typedef struct Bonus_T
{
    int N;
    uint8_t *sequence;
    int score;
    int taken;

} Bonus_T;

typedef struct BonusWrapper_T
{
    int N;
    Bonus_T *bonuses;
} BonusWrapper_T;



BonusWrapper_T *create_bonus_wrapper(const char *filename);
void free_bonus_wrapper(BonusWrapper_T *wrapper);


#endif // BONUS_H