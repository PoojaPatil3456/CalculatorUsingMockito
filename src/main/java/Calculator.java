public class Calculator {
    ArithmeticOperations service;
    public Calculator(ArithmeticOperations service) {
        this.service = service;
    }

    public double sum(double input1, double input2) {
        return service.sum(input1,input2);
    }

    public double difference(double input1, double input2) {
        return service.difference(input1,input2);
    }

    public double product(double input1, double input2) {
        return service.product(input1,input2);
    }

    public double division(double input1, double input2) {
        return service.division(input1,input2);
    }
}

