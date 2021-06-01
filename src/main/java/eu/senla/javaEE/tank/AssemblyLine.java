package main.java.eu.senla.javaEE.tank;

public class AssemblyLine implements IAssemblyLine{

    private ILineStep bodyLineStep;
    private ILineStep towerLineStep;
    private ILineStep engineLineStep;

    public ILineStep getBodyLineStep() {
        return bodyLineStep;
    }

    public void setBodyLineStep(ILineStep bodyLineStep) {
        this.bodyLineStep = bodyLineStep;
    }

    public ILineStep getTowerLineStep() {
        return towerLineStep;
    }

    public void setTowerLineStep(ILineStep towerLineStep) {
        this.towerLineStep = towerLineStep;
    }

    public ILineStep getEngineLineStep() {
        return engineLineStep;
    }

    public void setEngineLineStep(ILineStep engineLineStep) {
        this.engineLineStep = engineLineStep;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
       product.installFirstPart(bodyLineStep.buildProductPart());
        System.out.println("Install body");
        product.installSecondPart(towerLineStep.buildProductPart());
        System.out.println("Install tower");
        product.installThirdPart(engineLineStep.buildProductPart());
        System.out.println("Install engine");
        return product;
    }
}
