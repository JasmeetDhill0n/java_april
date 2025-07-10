package FunctionalInterface;

interface Parent2 {
    default void message() {
        System.out.println("Message from Parent2");
    }
}