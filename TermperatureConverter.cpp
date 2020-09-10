#include <iostream>
#include <string>
#include <Windows.h>

using namespace std;

//Very simple program, two functions that take a number and sends it through a formula to get whatever temperature the user is trying to get. Using int, could have used double for more
//precision. Decimals are just rounded.

int ConvertToFarenheit(int c) {
	c = ((c * 9) / 5) + 32;
	return c;
}

int ConvertToCelsius(int f) {
	f = (f - 32) * 5 / 9;
	return f;
}

int main() {
	cout << "Enter a number to be converted to Farenheit: ";
	int entry = 0;
	cin >> entry;
	cout << ConvertToFarenheit(entry) << endl;

	cout << "Enter a number to be converted to Celsius: ";
	cin >> entry;
	cout << ConvertToCelsius(entry) << endl;


	system("pause");
}

