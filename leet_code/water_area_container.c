#include <stdio.h>
#include <stdlib.h>


int minOf(int num1, int num2){
    return (num1 < num2) ? num1 : num2;
}

int main(){
    int pHeight[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int length = sizeof(pHeight) / sizeof(pHeight[0]);
    int outputF=0,outputD=0;

    for(int i=0;i<length;i++){
        for (int j = i+1; j < length; j++)
        {
           outputD=minOf(pHeight[i],pHeight[j])*(abs(i-j));
           if(outputD>=outputF){
            outputF=outputD;
            // printf("\n %d  %d ",pHeight[i],pHeight[j]);
           }
        }
        
    }
    printf("\n output is:%d",outputF);
    return 0;
}