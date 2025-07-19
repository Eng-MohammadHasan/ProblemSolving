#include <iostream>
using namespace std;

int ReadNumber()
{
    int Number;
    cin >> Number;
    return Number;
}

void SeparateCandies(int arr[], int n, int Mihai[], int &mSize, int Bianca[], int &bSize)
{
    mSize = 0;
    bSize = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
            Mihai[mSize++] = arr[i];
        else
            Bianca[bSize++] = arr[i];
    }
}

void SortDescending(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
        for (int j = i + 1; j < size; j++)
            if (arr[i] < arr[j])
                swap(arr[i], arr[j]);
}

void SortAscending(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
        for (int j = i + 1; j < size; j++)
            if (arr[i] > arr[j])
                swap(arr[i], arr[j]);
}

bool IsValidOrder(int Mihai[], int mSize, int Bianca[], int bSize)
{
    int Combined[200];
    int totalSize = 0;

    for (int i = 0; i < mSize; i++)
        Combined[totalSize++] = Mihai[i];

    for (int i = 0; i < bSize; i++)
        Combined[totalSize++] = Bianca[i];

    int mihaiSum = 0, biancaSum = 0;

    for (int i = 0; i < totalSize; i++)
    {
        if (Combined[i] % 2 == 0)
            mihaiSum += Combined[i];
        else
            biancaSum += Combined[i];

        if (mihaiSum <= biancaSum)
            return false;
    }

    return true;
}

bool CheckPossible(int arr[], int n)
{
    int Mihai[100], Bianca[100];
    int mSize, bSize;

    SeparateCandies(arr, n, Mihai, mSize, Bianca, bSize);
    SortDescending(Mihai, mSize);
    SortAscending(Bianca, bSize);

    return IsValidOrder(Mihai, mSize, Bianca, bSize);
}

int main()
{
    int t = ReadNumber();

    while (t--)
    {
        int n = ReadNumber();
        int arr[100];

        for (int i = 0; i < n; i++)
            arr[i] = ReadNumber();

        if (CheckPossible(arr, n))
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
