package Animals;

public abstract class AnimalSpecies {

    public static class WaterAnimals implements Differences.Water {

        public static class Fish extends Animal {
        }

        public static class Whale extends Mammal {
        }
    }

    public static class WoolAnimals extends Mammal implements Differences.Wool {

        public static class Cat {

        }

        public static class Bear {

        }

    }

}
