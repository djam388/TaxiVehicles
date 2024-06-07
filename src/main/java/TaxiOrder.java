class TaxiOrder {
    private Driver driver;
    private Movement movement;

    public TaxiOrder(TaxiFactory factory) {
        driver = factory.createDriver();
        movement = factory.createMovement();
    }

    public void displayOrderDetails() {
        System.out.println("Driver: " + driver.getDriverType());
        System.out.println("Movement: " + movement.getMovementType());
    }
}