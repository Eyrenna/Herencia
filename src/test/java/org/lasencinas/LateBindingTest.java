package org.lasencinas;

public class LateBindingTest {
    public static void main(String[] args) {
        LateBindingSuper lbSuper = new LateBindingSuper();
        LateBindingSub lbSub = new LateBindingSub();

        // Will access LateBindingSuper.print()
        lbSuper.print(); // #1

        // Will access LateBindingSub.print()
        lbSub.print();   // #2

        // Will access LateBindingSub.print()
        ((LateBindingSuper)lbSub).print(); // #3

        // Assign the lbSub to lbSuper
        lbSuper = lbSub; // Upcasting /*Downcasting??*/

        // Will access LateBindingSub.print() because lbSuper
        // is referring to a LateBindingSub object
        lbSuper.print(); // #4

        /*La unión se da en el tiempo de ejecución porque no es un método estático por lo que no se mantiene*/
    }
}