// dooz.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

void print(int array[3][3])
{
	for (int i = 0; i < 3; i++)
	{
		
		for (int j = 0; j < 3; j++)
		{
			cout << array[i][j]<<",";
		}
		cout   << endl;
	}
	cout << "X:"<<endl;
	cout << "O:"<<endl;
}

void readDooz(string dooz[3][3],string icon,int number)
{
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (number >= 1 && number <= 3&&i==0)
			{
				number--;
				if (dooz[i][number]=="")
				{
					dooz[i][number] += icon;
					break;
				}
				else
				{
					cout << "youer number is selected!!!" << endl;
				}
				
			}
			if (number >= 4 && number <= 6&&i==1)
			{
				number-=4;
				if (dooz[i][number]=="")
				{
					dooz[i][number] += icon;
					break;
				}
				else
				{
					cout << "youer number is selected!!!" << endl;
				}
			}
			if (number >= 7 && number <= 9&&i==2)
			{
				number-=7;
				if (dooz[i][number] == "")
				{
					dooz[i][number] += icon;
					break;
				}
				else
				{
					cout << "youer number is selected!!!" << endl;
				}
			}
		}
	}
}

void printDooz(string dooz[3][3])
{
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			cout << dooz[i][j] << ",";
		}
		cout << endl;
	}
}

 int search(int array[3][3], int number)
 {
	 bool trust = false;
	 for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (array[i][j]==number)
			{
				return number-1;
				break;
			}
			else
			{
				continue;
			}
		}
	}
	return -1;
 }
 bool victory(string dooz[3][3] )
 {
	 for (int i = 0; i < 3; i++)
	 {
		 for (int j = 0; j < 3; j++)
		 {
			 if (dooz[i][0]=="X" && dooz[i][1] =="X"&&dooz[i][2]=="X" || dooz[0][j] =="X" && dooz[1][j] =="X"&&dooz[2][j]=="X" || dooz[0][0] =="X" && dooz[1][1] =="X"&&dooz[2][2]=="X" || dooz[0][2] =="X"&& dooz[2][2] =="X"&& dooz[2][1]=="X")
			 {
				 cout << "player X victory..."<<endl;
				 return true;
				 break;
			 }
			 if (dooz[i][0] == "O" && dooz[i][1] == "O" && dooz[i][2] == "O" || dooz[0][j] == "O" && dooz[1][j] == "O" && dooz[2][j] == "O" || dooz[0][0] == "O" && dooz[1][1] == "O" && dooz[2][2] == "O" || dooz[0][2] == "O" && dooz[2][2] == "O" && dooz[2][1] == "O")
			 {
				 cout << "player O victory..." << endl;
				 return true;
				 break;
			 }
			 else
			 {
				 continue;
			 }
		 }
	 }
	 return false;
 }
 
int main()
{
	cout << "warning!!!\nif you choose a number that has already been chosen,\nit will be read as an error and your turn will be lost" << endl;
	
	int array[3][3]={{1,2,3},
		             {4,5,6},
		             {7,8,9}};
	print(array);
	string dooz[3][3];
	int X;
	int O;
	for (int i = 0; i < 5; i++)
	{
		cout << "pleas choose a number for X icon"<<endl;
		cin >> X;
		readDooz(dooz, "X", X);
		if (victory(dooz) == true)
		{
			printDooz(dooz);
			break;
		}
		if (i == 4)
		{
			cout << "mach is eqal!!!" << endl;
			printDooz(dooz);
			break;
		}
		cout << "pleas choose a number fo O icon" << endl;
		cin >> O;
		readDooz(dooz, "O", O);
		if (victory(dooz) == true)
		{
			printDooz(dooz);
			break;
		}
		
	}


}



// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
