#include <iostream>
#include <string>
#include <fstream>

using namespace std;


int line_count() {              //function to read total number of lines in the products file
    ifstream x("products.dat");
    int count = 0;
    string trash;
    while (getline(x,trash)) {
        count++;
    }
    x.close();
    return count;
}



class product {                     //class to store the data of each product
public:
    int id;
    string name;
    int price;
    void assign(int id,string name, int price) {
        this->id = id;
        this->name = name;
        this->price = price;
    }
};


product *p;                       //golbal pointer object


class billing_system {
public:
    void load_data() {              //method to load each line of the data file as an object of class product
        int line = line_count();
        ifstream file("products.dat");
        p = new product[line];
        int id;
        string name;
        int price;
        for (int i = 0 ; i < line ; i++ ) {
            file >> id;
            file >> name;
            file >> price;
            p[i].assign(id,name,price);
        }
        file.close();
    }
    billing_system() {
        this->load_data();
    }
    
    void add_data() {
        int id;
        string name;
        int price;
        ofstream p("products.dat", ios::app);
        cout << "Enter the id of the product --> ";
        cin >> id;
        cout << "Enter the name of the product --> ";
        cin >> name;
        cout << "Enter the price of the product --> ";
        cin >> price;
        p << id << " " << name << " " << price << endl;
        p.close();
        this->load_data();
    }
    
    int return_price(int id) {                  //method to return the price of a particular product
        for(int i = 0 ; i < line_count() ; i++) {
            if (p[i].id == id)
                return p[i].price;
        }
        return 0;
    }
    
    string return_name(int id) {
        for(int i = 0 ; i < line_count() ; i++) {
            if (p[i].id == id)
                return p[i].name;
        }
        return " ";
    }
    
    int return_tax(int price) {
        float res = price*0.1;
        return res;
    }
    
    void save_invoice() {
        string line;
        ifstream c("current_invoice.dat");
        ofstream s("invoice_details.dat", ios::app);
        while(c) {
            getline(c,line);
            s << line;
        }
        s.close();
        c.close();
    }
    
    void print_invoice() {
        string line;
        ifstream c("current_invoice.dat");
        while(c) {
            getline(c,line);
            cout << line;
        }
    }
    
    void print_data() {
        string line;
        ifstream c("products.dat");
        while (c) {
            getline(c,line);
            cout << line;
        }
    }
    
    
    void create_invoice() {
        int id = 1;
        int q = 1;
        int pr;
        float total = 0;
        string name;
        ofstream c("current_invoice.dat");
        cout << "Enter the id of the product and quantity seperated by space(0 to end)" << endl;
        cout << "---> ";
        c << "==============================\n\t\t\tSuper Market\n";
        c << "==============================" << endl;
        c << "QTY\t\tID\t\tDescription\t\tUnit Price\t\tTotal Price" << endl;
        c << "---\t\t--\t\t-----------\t\t----------\t\t-----------\n" << endl;
        while (id) {
            cin >> id >> q;
            pr = this->return_price(id);
            name = this->return_name(id);
            if (pr == 0) {
                cout << "Invalid ID";
                continue;
            }
            total += q*pr;
            c << q << "\t\t" << id <<"\t\t" << name << "\t\t" << pr << "\t\t" << q*pr << endl;
        }
        c << "\t\t\t\t\t\t\t\tSubtotal\t\t\t" << total << endl;
        c << "\t\t\t\t\t\t\t\tTax\t\t\t" <<  return_tax(total) << endl;
        c << "\t\t\t\t\t\t\t\tTotal\t\t\t" << total + return_tax(total)<< endl;
        c.close();
        this->save_invoice();
    }
    
    
    
};



int main() {
    billing_system b;
    int x;
FLAG:
    cout << "\t\t\t\tBilling system" << endl;
    cout << "1. Add record" << endl;
    cout << "2. View record" << endl;
    cout << "3. Invoice record" << endl;
    cout << "4. Bill " << endl;
    cout << "5. Exit "<< endl;
    cout << ">>";
    cin >> x;
    if (x == 1) {
        b.add_data();
        system("pause");
        goto FLAG;
    }
    else if (x == 2) {
        b.print_data();
        system("pause");
        goto FLAG;
    }
    else if (x == 3) {
        b.print_invoice();
        system("pause");
        goto FLAG;
    }
    else if (x == 4) {
        b.create_invoice();
        system("pause");
        goto FLAG;
    }
    else if (x == 5){
        return 0;
    }
    else {
        cout << "Invalid Input!" << endl;
        goto FLAG;
    }
}
