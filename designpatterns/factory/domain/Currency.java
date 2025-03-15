package designpatterns.factory.domain;

public interface Currency {
    String getSymbol();
}

// classes here just for example
class Dollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}