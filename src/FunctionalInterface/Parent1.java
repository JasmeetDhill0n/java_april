package FunctionalInterface;

    interface Parent1 {
        default void message() {
            System.out.println("Message from Parent1");
        }
    }

