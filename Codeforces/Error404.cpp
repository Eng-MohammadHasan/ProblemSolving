#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;

        string s;
        cin >> s;

        int assigned[26]; // -1: unassigned, 0 or 1: assigned bit
        for (int i = 0; i < 26; i++)
            assigned[i] = -1;

        bool possible = true;

        for (int i = 0; i < n; i++)
        {
            int ch = s[i] - 'a';

            if (i == 0)
            {
                if (assigned[ch] == -1)
                    assigned[ch] = 0; // assign first char to 0
            }
            else
            {
                int prevCh = s[i - 1] - 'a';

                int expected = 1 - assigned[prevCh]; // alternate bit
                if (assigned[ch] == -1)
                {
                    assigned[ch] = expected;
                }
                else if (assigned[ch] != expected)
                {
                    possible = false;
                    break;
                }
            }
        }

        cout << (possible ? "YES\n" : "NO\n");
    }

    return 0;
}
