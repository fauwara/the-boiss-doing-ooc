// Write a C++ program to create a class called ITEMS to store ItemName, ItemPrice,
// ItemTax and ItemDisc. For all items, 10% of ItemPrice will be considered as tax. Create
// the constructors for the following cases:
// i). If only ItemName is provided, consider ItemPrice as 100, ItemDisc =10
// ii). If ItemName is provided with ItemPrice, ItemDisc will be 5% of ItemPrice.
// iii). ItemName is provided with ItemPrice and ItemDisc
// Input the Items information for above cases and display the ItemName and total amount
// for all items

#include <iostream>
#include <string>
using namespace std;

class ITEMS{
    
    public:
        string itemName;
        int itemPrice;
        int itemTax = 10;
        int itemDisc;
    
        ITEMS(string name){
            itemName = name;
            itemPrice = 100;
            itemDisc = 10;

            cout << endl << " - Item " << itemName << " has been created."<< endl;
            cout << " - Price: " << itemPrice << endl;
            cout << " - Discount: " << itemDisc << endl;
            cout << " - Total Price: " << itemPrice - itemDisc << endl;
        }

        ITEMS(string name, int price){
            itemName = name;
            itemPrice = price;
            itemDisc = price*0.05;

            cout << endl << " - Item " << itemName << " has been created."<< endl;
            cout << " - Price: " << itemPrice << endl;
            cout << " - Discount: " << itemDisc << endl;
            cout << " - Total Price: " << itemPrice - itemDisc << endl;
        }
        
        ITEMS(string name, int price, int disc){
            itemName = name;
            itemPrice = price;
            itemDisc = disc;

            cout << endl << " - Item " << itemName << " has been created."<< endl;
            cout << " - Price: " << itemPrice << endl;
            cout << " - Discount: " << itemDisc << endl;
            cout << " - Total Price: " << itemPrice - itemDisc << endl;
        }
    
};

int main(){

    ITEMS("toy");
    ITEMS("fridge", 22000);
    ITEMS("TV", 30000, 5000);

    return 0;
}
