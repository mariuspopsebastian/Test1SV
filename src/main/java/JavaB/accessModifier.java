package JavaB;

import JavaB.Inheritance.Parent.Pack.newexemple;

/**
 * Created by Marius on 18-Jan-18.
 */
public class accessModifier {



    public static void main(String[] args) {

        newexemple ne =new  newexemple();
        ne.metoda();
        //ne.z;


        //Default: access method anywhere only in package
        //public: variable/method can be accessed from anywhere all the packages
        //private: you can not access method/variable outside the class
        //protected: variable/method can be accessed in all the classes from the package +can be accessed in subclasses from other packages ( un fel de default+ )
    }

}
