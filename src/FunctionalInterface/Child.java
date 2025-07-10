package FunctionalInterface;
class Child implements Parent1, Parent2 {
        // Must override  message
        @Override
        public void message() {
            Parent2.super.message();
        }

        public void usePrinter() {
            MessagePrinter printer = new MessagePrinter() {
                @Override
                public void print() {
                    message(); // calling resolved method
                }
            };
            printer.print(); // calling the functional method
        }
    }

