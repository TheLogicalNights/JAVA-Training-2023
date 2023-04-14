#include<stdio.h>
#include<iostream>

class A {
    public:
        A() {
            std::cout<<"Constructor of Class A\n";
        }
        ~A() {
            std::cout<<"Destructor of Class A\n";
        }
};

class B : public A {
    public:
        B() {
            std::cout<<"Constructor of Class B\n";
        }
       ~B() {
            std::cout<<"Destructor of Class B\n";
        } 
};

class C : public A {
    public:
        C() {
            std::cout<<"Constructor of Class C\n";
        }
        ~C() {
            std::cout<<"Destructor of Class C\n";
        }
};

class D : public B {
    public:
        D() {
            std::cout<<"Constructor of Class D\n";
        }
        ~D() {
            std::cout<<"Destructor of Class D\n";
        }
};

class E : public B {
    public:
        E() {
            std::cout<<"Constructor of Class E\n";
        }
        ~E() {
            std::cout<<"Destructor of Class E\n";
        }
};

class F : public C {
    public:
        F() {
            std::cout<<"Constructor of Class F\n";
        }
        ~F() {
            std::cout<<"Destructor of Class F\n";
        }
};

class G : public C {
    public:
        G() {
            std::cout<<"Constructor of Class G\n";
        }
        ~G() {
            std::cout<<"Destructor of Class G\n";
        }
};

class H : public D, public E {
    public:
        H() {
            std::cout<<"Constructor of Class H\n";
        }
        ~H() {
            std::cout<<"Destructor of Class H\n";
        }
};

class I : public F, public G {
    public:
        I() {
            std::cout<<"Constructor of Class I\n";
        }
        ~I() {
            std::cout<<"Destructor of Class I\n";
        }
};

class J : public H, public I {
    public:
        J() {
            std::cout<<"Constructor of Class J\n";
        }
        ~J() {
            std::cout<<"Destructor of Class J\n";
        }
};


int main () {
    J j;
    return 0;
}