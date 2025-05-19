package section14_sealed_classes;

public class SealedClassHierarchywithMultipleLayers {
}

sealed class Vehicle permits Car {}

sealed class Car extends Vehicle permits ElectricCar, GasCar {}

final class ElectricCar extends Car {}

non-sealed class GasCar extends Car {}

// 🔹 You can chain sealed types, but each level must declare permits or use implicit nesting.