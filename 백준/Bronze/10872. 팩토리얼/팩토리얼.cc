#include <stdio.h>

int main(void) {
  int n;
  int result = 1;

  scanf("%d", &n);

  for (int i = n; i>0; i--){
    result *= i;
  }
  printf("%d", result);
  return 0;
}