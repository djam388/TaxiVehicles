public class TaxiOrderApp {
    public static void main(String[] args) {
        TaxiFactory carTaxiFactory = new TaxiFactoryCarImpl();
        TaxiOrder carOrder = new TaxiOrder(carTaxiFactory);
        carOrder.displayOrderDetails();

        TaxiFactory truckTaxiFactory = new TaxiFactoryTruckImpl();
        TaxiOrder truckOrder = new TaxiOrder(truckTaxiFactory);
        truckOrder.displayOrderDetails();

        TaxiFactory motoTaxiFactory = new TaxiFactoryMotoImpl();
        TaxiOrder motoOrder = new TaxiOrder(motoTaxiFactory);
        motoOrder.displayOrderDetails();

        TaxiFactory coachTaxiFactory = new TaxiFactoryCoachImpl();
        TaxiOrder coachOrder = new TaxiOrder(coachTaxiFactory);
        coachOrder.displayOrderDetails();
    }
}
