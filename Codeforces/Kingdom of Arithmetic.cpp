#include <iostream>
using namespace std;

enum enOperationType
{
    Add = 1,
    Subtract
};

enOperationType CheckValidOperation(int a, int b, int c)
{
    if (a + b == c)
        return enOperationType::Add;
    else
        return enOperationType::Subtract;
}

char PrintResults(enOperationType ValidOperation)
{
    if (ValidOperation == enOperationType::Add)
        return '+';
    else
        return '-';
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int a, b, c;
        cin >> a >> b >> c;

        cout << PrintResults(CheckValidOperation(a, b, c)) << endl;
    }

    return 0;
}
