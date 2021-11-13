public int diff21(int n) {
int dif=0;
if(n<=21){
  dif = 21-n;
}
if(n>21){
  dif = 2*(n-21);
}
return dif;
}
