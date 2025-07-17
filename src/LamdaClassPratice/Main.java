package LamdaClassPratice;

public class Main {
    //make a class VehicleValidate and a method validatePlate,
    //    which will accepts IChecker and licence plate number(Integer)
    //    in impl call check method to determine weather vehicle is allowed to drive or not
    //From Main method : call to validatePlate and print result.
    public static void main(String[] args) {
        VehicleValidate validate = new VehicleValidate();

        Checker checker = (n) -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        validate.validatePlate(checker,44433);
        validate.validatePlate(checker,456456);

    }
}
