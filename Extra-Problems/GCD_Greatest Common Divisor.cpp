#include <iostream>
using namespace std;

void ReadNumbers(int &Number1, int &Number2)
{
    cout << "Please Enter Number 1: ";
    cin >> Number1;

    cout << "Please Enter Number 2: ";
    cin >> Number2;
}

int MinNumber(int Number1, int Number2)
{
    return (Number1 < Number2) ? Number1 : Number2;
}

int GCD(int Number1, int Number2, int MinNumber)
{
    for (int i = MinNumber; i >= 1; i--)
    {
        if (Number1 % i == 0 && Number2 % i == 0)
            return i;
    }
    return 1; // Fallback in case there's no common divisor (shouldn't happen)
}

void PrintResult(int GCD)
{
    cout << "The Greatest Common Divisor is: " << GCD << endl;
}

int main()
{
    int Number1, Number2;
    ReadNumbers(Number1, Number2);
    int Min = MinNumber(Number1, Number2);
    PrintResult(GCD(Number1, Number2, Min));

    return 0;
}
