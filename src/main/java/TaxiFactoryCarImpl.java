class TaxiFactoryCarImpl implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new DriverRacerImpl();
    }

    @Override
    public Movement createMovement() {
        return new MovementDrivingImpl();
    }
}
