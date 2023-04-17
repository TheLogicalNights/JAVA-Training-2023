#include<stdio.h>
#include<iostream>

class StaticPoly {
    
    public:
        int add(int a, int b) {
            return a+b;
        }

        int add(int a, int b, int c) {
            return a+b+c;
        }
};

int main() {
    StaticPoly staticPoly;

    std::cout<<"Addition of two numbers is:"<<staticPoly.add(45,5)<<"\n";
    std::cout<<"Addition of three numbers is:"<<staticPoly.add(45,5,10)<<"\n";

}