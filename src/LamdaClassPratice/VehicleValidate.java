package LamdaClassPratice;

public class VehicleValidate {
    //make a class VehicleValidate and a method validatePlate,
    //    which will accepts IChecker and licence plate number(Integer)
    //    in impl call check method to determine weather vehicle is allowed to drive or not
    void validatePlate(Checker checker,int licensePlateNumber){
        boolean result = checker.IChecker(licensePlateNumber);
        if(result){
            System.out.println("Allowed license plate number - "+licensePlateNumber);
        }
        else{
            System.out.println("Not Allowed license plate number - "+licensePlateNumber);
        }
    }
}
