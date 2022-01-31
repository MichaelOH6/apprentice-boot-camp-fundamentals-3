package tax;

public class DefaultTaxCalculator extends TaxCalculator {
    public int calculateTax(Vehicle vehicle) {
        if (isInRange(vehicle) == 1){
            return 10;
        }else if(isInRange(vehicle) == 2){
            return 25;
        }else if(isInRange(vehicle) == 3){
            return 105;
        }else if(isInRange(vehicle) == 4){
            return 125;
        }else if(isInRange(vehicle) == 5){
            return 145;
        }else if(isInRange(vehicle) == 6){
            return 165;
        }else if(isInRange(vehicle) == 7){
            return 205;
        }else if(isInRange(vehicle) == 8){
            return 515;
        }else if(isInRange(vehicle) == 9){
            return 830;
        }else if(isInRange(vehicle) == 10){
            return 1240;
        }else if(isInRange(vehicle) == 11){
            return 1760;
        }else if(isInRange(vehicle) == 12){
            return 2070;
        }

        return 0;
    }


    public Integer isInRange(Vehicle vehicle){
        if (vehicle.getCo2Emissions() > 0 && vehicle.getCo2Emissions() <= 50) {
            return 1;
        }else if (vehicle.getCo2Emissions() > 50 && vehicle.getCo2Emissions() <= 75) {
            return 2;
        }else if (vehicle.getCo2Emissions() > 75 && vehicle.getCo2Emissions() <= 90) {
            return 3;
        }else if (vehicle.getCo2Emissions() > 90 && vehicle.getCo2Emissions() <= 100) {
            return 4;
        }else if (vehicle.getCo2Emissions() > 100 && vehicle.getCo2Emissions() <= 110) {
            return 5;
        }else if (vehicle.getCo2Emissions() > 110 && vehicle.getCo2Emissions() <= 130) {
            return 6;
        }else if (vehicle.getCo2Emissions() > 130 && vehicle.getCo2Emissions() <= 150) {
            return 7;
        }else if (vehicle.getCo2Emissions() > 150 && vehicle.getCo2Emissions() <= 170) {
            return 8;
        }else if (vehicle.getCo2Emissions() > 170 && vehicle.getCo2Emissions() <= 190) {
            return 9;
        }else if (vehicle.getCo2Emissions() > 190 && vehicle.getCo2Emissions() <= 225) {
            return 10;
        }else if (vehicle.getCo2Emissions() > 225 && vehicle.getCo2Emissions() <= 255) {
            return 11;
        }else if (vehicle.getCo2Emissions() > 255 ) {
            return 12;
        }
        return -1;
    }
//    public boolean isInRangeTwo(Vehicle vehicle){
//        if (vehicle.getCo2Emissions() > 50 && vehicle.getCo2Emissions() <= 75) {
//            return true;
//        }
//        return false;
//    }



}