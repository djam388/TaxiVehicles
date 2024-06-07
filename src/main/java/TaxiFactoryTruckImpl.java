class TaxiFactoryTruckImpl implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new DriverTruckerImpl();
    }

    @Override
    public Movement createMovement() {
        return new MovementCrawlingImpl();
    }
}