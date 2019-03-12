package org.lasencinas;

public class AOSub extends AOSuper {
    public void print() {
        // Call print() method of AOSuper class
        super.print();

        // Print a message
        System.out.println("Inside AOSub.print()");
    }

    /*Las dos primeras salidas corresponden a este método de la clase Sub; el método print de la clase Super se está
    sobreescribiendo
     */

    public void callOverridenPrint() {
        // Call print() method of AOSuper class
        super.print();
    }
    /*si llamamos al método print de la clase super se ejecuta el de la clase super porque el objeto referenciado es Super
    * como en la primera orden del método print de la clase Sub*/
}

