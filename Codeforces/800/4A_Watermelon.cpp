#include <iostream>
using namespace std ;

short ReadWeight()
{
  short w = 0;
 
  do
  {
    cin >> w ;
  }while (w < 1 || w > 100) ;

  return w;
}

bool DivideTwoEvenParts(short Kilos)
{
   return (Kilos >= 4 && Kilos % 2 == 0) ;
}

int main() {

  // w .. kilos
  short w = ReadWeight();
  cout <<  (DivideTwoEvenParts(w) ? "Yes" : "No" ) << endl;

  return 0;
}
