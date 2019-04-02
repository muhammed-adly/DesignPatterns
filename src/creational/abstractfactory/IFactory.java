package creational.abstractfactory;

abstract class IFactory {
    public abstract CPU createCPU();

    public abstract MMU createMMU();
}
