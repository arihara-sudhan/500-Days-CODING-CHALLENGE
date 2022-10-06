#include<stdio.h>
#include<conio.h>
#include<string.h>

int main() {
    char str[100];
    int i,size,s,pos;
    scanf("%s", &str);
    size=strlen(str);
    for(i=0;i<size;i++) {
        if((str[i]>=65 && str[i]<=90) || (str[i]>=97 && str[i]<=122)) {
            i++;
        } else {
            if(str[i]>='0' && str[i]<='9') {
                for(s=0;s<str[i];s++) {
                    printf("%s", str[i-1]);
                }
            }
            i++;
        }
    }
}