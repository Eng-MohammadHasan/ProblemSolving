#include <iostream>
using namespace std;

enum enForm
{
    Stairs = 1,
    Peak = 2,
    Neither = 3
};

enForm CheckFormType(int a, int b, int c)
{
    if (a < b && b < c)
    {

        return enForm::Stairs;
    }
    else if (a < b && b > c)
    {
        return enForm::Peak;
    }

    else
    {
        return enForm::Neither;
    }
}

void PrintFormType(enForm FormType)
{
    if (FormType == enForm::Stairs)
    {
        cout << "STAIR" << endl;
    }
    else if (FormType == enForm::Peak)
    {
        cout << "PEAK" << endl;
    }
    else
    {
        cout << "NONE" << endl;
    }
}

int main()
{

    int t;
    cin >> t;

    while (t--)
    {
        int a, b, c;
        cin >> a >> b >> c;
        PrintFormType(CheckFormType(a, b, c));
    }
    return 0;
}
