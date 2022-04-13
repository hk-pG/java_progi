#include <stdio.h>

int main(int count, char const *hikisuu[]) {
	// print args
	for (int i = 0; i < count; i++) {
		printf("argv[%d] = %s\n", i, hikisuu[ i ]);
	}
	return 0;
}
