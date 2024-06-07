class TaxiFactoryCoachImpl implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new DriverCoachmanImpl();
    }

    @Override
    public Movement createMovement() {
        return new MovementGallopingImpl();
    }
}
