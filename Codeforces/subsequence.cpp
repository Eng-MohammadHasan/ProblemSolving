#include <iostream>
using namespace std;

int MAX = 5001;

bool canBuildArray(int arr[], int n) {
    int reachable[5001] = {0};  // reachable[i] = 1 means sum i is possible
    reachable[0] = 1;

    // Simple bubble sort for sorting the array
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            if (arr[i] > arr[j])
                swap(arr[i], arr[j]);

    for (int i = 0; i < n; i++) {
        int x = arr[i];

        if (!reachable[x]) {
            return false;  // can't form this number
        }

        // Add x to all existing sums to form new sums
        for (int j = MAX - 1; j >= 0; j--) {
            if (reachable[j] && j + x < MAX)
                reachable[j + x] = 1;
        }
    }

    return true;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        int c[5001];

        for (int i = 0; i < n; i++)
            cin >> c[i];

        if (canBuildArray(c, n))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
