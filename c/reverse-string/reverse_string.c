#include <stddef.h>
#include <stdlib.h>
#include <string.h>
#include "reverse_string.h"

char* reverse(const char *value) {
    size_t len = strlen(value);
    char* reversed_value = malloc(sizeof(char)*(strlen(value)+1));
    reversed_value[len] = '\0';
    for (size_t i = 0; i < len; i++)
        reversed_value[i] = value[len-i-1];
    return reversed_value;
}