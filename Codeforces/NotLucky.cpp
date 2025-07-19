#include <iostream>
using namespace std;

bool IsLuckyTicket(const string &ticket)
{
    int firstSum = 0, secondSum = 0;

    for (int i = 0; i < 3; i++)
        firstSum += ticket[i] - '0';

    for (int i = 3; i < 6; i++)
        secondSum += ticket[i] - '0';

    return firstSum == secondSum;
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        string ticket;
        cin >> ticket;

        if (IsLuckyTicket(ticket))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
