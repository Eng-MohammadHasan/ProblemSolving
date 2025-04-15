#include <iostream>
using namespace std;

void ReadNumbers(int &a, int &b)
{
    cout << "Please Enter Number 1: ";
    cin >> a;
    cout << "Please Enter Number 2: ";
    cin >> b;
}

int GCD(int a, int b)
{
    while (b != 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

void PrintResult(int result)
{
    cout << "The Greatest Common Divisor is: " << result << endl;
}

int main()
{
    int num1, num2;
    ReadNumbers(num1, num2);
    PrintResult(GCD(num1, num2));
    return 0;
}
