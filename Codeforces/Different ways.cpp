#include <iostream>
#include <ctime>
#include <cstdlib>
#include <string>
using namespace std;

void Swap(char &a, char &b)
{
    char temp = a;
    a = b;
    b = temp;
}

int RandomNumber(int From, int To)
{
    return rand() % (To - From + 1) + From;
}

string RearrangeString(string s)
{
    string r = s;
    int len = s.length();
    for (int i = 0; i < len * 2; i++)
    {
        int index1 = RandomNumber(0, len - 1);
        int index2 = RandomNumber(0, len - 1);
        Swap(r[index1], r[index2]);
    }
    return r;
}

bool CheckRearrangePossibility(string s, string r)
{
    return s != r;
}

void PrintResults(bool canRearrange, string r)
{
    if (!canRearrange)
        cout << "NO" << endl;
    else
    {
        cout << "YES" << endl;
        cout << r << endl;
    }
}

bool AllCharactersSame(string s)
{
    for (int i = 1; i < s.length(); i++)
    {
        if (s[i] != s[0])
            return false;
    }
    return true;
}

int main()
{
    srand((unsigned)time(NULL));
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        if (AllCharactersSame(s))
        {
            cout << "NO" << endl;
            continue;
        }
        string r;
        do
        {
            r = RearrangeString(s);
        } while (!CheckRearrangePossibility(s, r));
        PrintResults(true, r);
    }
    return 0;
}
