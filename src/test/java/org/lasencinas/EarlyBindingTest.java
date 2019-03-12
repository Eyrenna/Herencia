package org.lasencinas;

public class EarlyBindingTest {
    public static void main(String[] args) {
        EarlyBindingSuper ebSuper = new EarlyBindingSuper();
        EarlyBindingSub ebSub = new EarlyBindingSub();

        // Will access EarlyBindingSuper.str
        System.out.println(ebSuper.str);

        // Will access EarlyBindingSuper.count
        System.out.println(ebSuper.count);

        // Will access EarlyBindingSuper.print()
        ebSuper.print();

        /*Hasta aquí printa lo definido en la clase Super, tal cual está inicializado*/

        System.out.println("------------------------------");

        // Will access EarlyBindingSub.str
        System.out.println(ebSub.str);

        // Will access EarlyBindingSub.count
        System.out.println(ebSub.count);

        // Will access EarlyBindingSub.print()
        ebSub.print();

        /*Printa lo declarado en la clase Sub, tal cual está inicializado
        * Toma: todos los campos (estaticos y no estaticos)
        * Los  métodos estáticos y
        * los métodos finales no estáticos*/

        System.out.println("------------------------------");

        // Will access EarlyBindingSuper.str
        System.out.println(((EarlyBindingSuper) ebSub).str);

        // Will access EarlyBindingSuper.count
        System.out.println(((EarlyBindingSuper) ebSub).count);

        // Will access EarlyBindingSuper.print()
        ((EarlyBindingSuper) ebSub).print();

        /*Utiliza el objeto ebSub (objeto de la clase Sub) pero el método de la clase Super porque referecia ebSub como
        * objeto de Super*/

        System.out.println("------------------------------");

        // Assign the ebSub to ebSuper
        ebSuper = ebSub; // Upcasting

                /* Now access methods and fields using ebSuper variable, which is
                 referring to a EarlyBindingSub object
                */
                /*Al hacer upcasting se utiliza lo de la clase Super*/

        // Will access EarlyBindingSuper.str
        System.out.println(ebSuper.str);

        // Will access EarlyBindingSuper.count
        System.out.println(ebSuper.count);

        // Will access EarlyBindingSuper.print()
        ebSuper.print();
        System.out.println("------------------------------");
    }
}

/*EarlyBindingSuper
100
Inside EarlyBindingSuper.print()
------------------------------
EarlyBindingSub
200
Inside EarlyBindingSub.print()
------------------------------
EarlyBindingSuper
100
Inside EarlyBindingSuper.print()
------------------------------
EarlyBindingSuper
100
Inside EarlyBindingSuper.print()
------------------------------
*/