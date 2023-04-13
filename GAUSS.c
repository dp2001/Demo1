#include <stdio.h>
float  arr[20][20]={0};//存储行列式
int n=0;//记录矩阵阶数
int z=0;
float a[19]={0};//未知数计算结果
float b[19]={0};//用于回代计算
void setmatrix()//输入矩阵
{
    for (int i = 0; i < n; ++i){
        for (int j = 0; j < z; ++j) {
            float x;
            scanf("%f",&x);
            arr[i][j]=x;
        }
        printf("换行\n");
    }
}
void getmatrix()//矩阵变形
 {
    for (int i = 0; i <n ; ++i) {
        for (int j = 0; j < z; ++j) {
            printf("%f  ",arr[i][j]);
        }
        printf("\n");
    }
}

void sort(int k)//将列主元素从高到低排列(将等于零的放在最下面)
{
    for (int i = k; i <n-1 ; ++i) {
        if (arr[i+1][k]>arr[i][k]||arr[i][k]==0){
            for (int x = 0; x < z; ++x) {
                float num=arr[i][x];
                arr[i][x]=arr[i+1][x];
                arr[i+1][x]=num;
            }
        }
    }
}
void simple(int k)//将矩阵列主元素单位化
{
    for (int i =0; i <n-1 ; i++) {
        sort(k);
    }
getmatrix();
    for (int j = k; j <n ; ++j) {
        float  temp=arr[j][k];

        for (int j1 = k; j1 < z; ++j1) {
            if (temp==0) break;
            arr[j][j1]=arr[j][j1]/temp;
        }
    }

}

void change (int k)       //初等行变换
{
    for (int i = k; i < n; ++i){
        for (int i1 = k; i1 < z; ++i1){
            if (arr[i+1][k]==0)  break;
            arr[i+1][i1]=arr[i+1][i1]-arr[k][i1];
        }
    }

}
float gauss() 
{
    for (int k= 0; k< n; ++k)  {
           simple(k);       //对每行数据进行处理
           change(k);
    }
    for (int i = 0; i < n; ++i){
        b[i]=arr[i][n];
    }
    a[n-1]=b[n-1]/arr[n-1][n-1];
    float S=0;
    for (int i =n-2; i >=0; i--) {
        S=b[i];
        for( int j=i-1; j<n; j++)
        {
            S=S-arr[i][j]*a[j];
        }
        a[i]=S/arr[i][i];
    }
}

float  countmatrix()//三阶行列式求值
 {
    for (int i = 0; i < n-1; ++i) {
        for (int j = 0; j < n; ++j) {
            arr[j][i+n]=arr[j][i];
        }
    }
   float leftsum=0,rightsum=0;
    int x=1;
    for (int i = 0; i < n; ++i) {
       int t=i;
        for (int j = 0; j < n; ++j,++t) {
           x=x*arr[j][t];
        }
        leftsum+=x;
        x=1;
    }
    x=1;
    for (int i = n-1; i <2*n-1 ; ++i) {
        int y=i;
        for (int j = 0; j <n ; ++j,--y) {
            x=x*arr[j][y];
        }
        rightsum+=x;
        x=1;
    }
    return leftsum-rightsum;
}
int main(){
    printf("请输入矩阵阶数\n");
    scanf("%d",&n);
    z=n+1;
    printf("请输入按行输入矩阵\n");
    setmatrix();
    gauss();
    int k=1;
    for (int i = 0; i < n; ++i,k++){
        printf("x[%d]= %f \n",k,a[i]);
    }
}
