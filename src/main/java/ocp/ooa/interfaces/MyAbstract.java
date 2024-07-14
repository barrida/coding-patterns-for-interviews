package ocp.ooa.interfaces;

/**
 * @author suleyman.yildirim
 */

// An abstract class can be extended by an abstract or a concrete class.
abstract class MyAbstract {
}

class Concrete extends MyAbstract{

}

// A concrete class can be extended by an abstract or a concrete class.
// Any class, whether abstract or concrete, can implement any interface

class A extends Concrete implements X {

}

// Any class, whether abstract or concrete, can implement any interface
abstract class B extends Concrete implements X{

}

interface X {

}

interface Y extends X {

}