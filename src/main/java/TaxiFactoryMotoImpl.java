class TaxiFactoryMotoImpl implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new DriverBikerImpl();
    }

    @Override
    public Movement createMovement() {
        return new MovementRacingImpl();
    }
}
