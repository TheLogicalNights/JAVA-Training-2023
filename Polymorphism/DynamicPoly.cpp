#include<stdio.h>
#include<iostream>

class A {
    public:
        virtual void show() {
            std::cout<<"Show method of class A\n";
        }

        void display() {
            std::cout<<"Display method of class A\n";
        }
};

class B : public A {
    public:
        void show() {
            std::cout<<"Show method of class B\n";
        }
};

int main() {
    A a;
    B b;

    A *aPtr;
    B *bPtr;

    a.show();
    b.show();
    b.display();

    aPtr = &a;
    aPtr->show();
    bPtr = &b;
    bPtr->show();
    aPtr = &b;
    aPtr->show();    
}