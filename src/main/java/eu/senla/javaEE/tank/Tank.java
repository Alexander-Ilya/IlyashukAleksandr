package main.java.eu.senla.javaEE.tank;

public class Tank implements IProduct {

    private IProductPart body;
    private IProductPart tower;
    private IProductPart engine;

    public IProductPart getBody() {
        return body;
    }

    public void setBody(IProductPart body) {
        this.body = body;
    }

    public IProductPart getTower() {
        return tower;
    }

    public void setTower(IProductPart tower) {
        this.tower = tower;
    }

    public IProductPart getEngine() {
        return engine;
    }

    public void setEngine(IProductPart engine) {
        this.engine = engine;
    }

    @Override
    public void installFirstPart(IProductPart body) {
        if (body instanceof Body) {
            setBody(body);
        }
    }

    @Override
    public void installSecondPart(IProductPart tower) {
        if (tower instanceof Tower) {
            setTower(tower);
        }
    }

    @Override
    public void installThirdPart(IProductPart engine) {
        if (engine instanceof Engine) {
            setTower(tower);
        }
    }
}
