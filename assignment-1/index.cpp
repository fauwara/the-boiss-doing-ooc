// Write a C++ program to create classes FOOD (Private: fdname, fdprice) and ORDER
// (Private: fdqty). Include a function OrderFood in ORDER class to input the values for
// fdname, fdprice, and fdqty and then display the total amount of the item (fdprice * fdqty).
// Also add 10% tax to total amount if total amount is more than 500.

#include <iostream>
#include <string>
using namespace std;

class FOOD{
    
    private:
        string fdname;
        int fdprice;

    public:
        
        FOOD (string name, int price){
            fdname = name;
            fdprice = price;

            cout << endl << "Food Created" << endl;
            getDetails();
        }

        void getDetails(){
            cout << "###########################" << endl;
            cout << "Food Name: " << fdname << endl;
            cout << "Food Price: " << fdprice << endl;            
            cout << "###########################" << endl << endl;
        }
};

class ORDER{
    
    private:
        int fdqty;

    public:
        void orderFood(){
            
            string fdname;
            int fdprice;
            int finalPrice;

            cout << "Enter the Food Name: ";
            cin >> fdname;
            cout << "Enter the Food Price: ";
            cin >> fdprice;
            
            FOOD(fdname, fdprice);

            cout << "Enter the Quantity of Food: ";
            cin >> fdqty;

            finalPrice = fdqty*fdprice;
            finalPrice = (finalPrice > 500)? finalPrice+(finalPrice*0.1) : finalPrice;
            cout << "Your total price will be: " << finalPrice;

        }
};

int main(){
    
    ORDER order1;
    order1.orderFood();

    return 0;
}