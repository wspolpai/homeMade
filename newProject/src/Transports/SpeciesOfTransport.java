package Transports;

import Transports.Properties.Cargo;
import Transports.Properties.Screw;
import Transports.Properties.Wheels;
import Transports.Properties.Wings;

public class SpeciesOfTransport {

    public static class Airplane implements Wheels, Cargo, Screw, Wings {

    }

    public static class Helicopter implements Wheels, Screw, Cargo {

    }

    public static class Boat implements Screw, Cargo {

    }

    public static class Tanker implements Screw, Cargo {

    }

    public static class Truck implements Wheels, Cargo {

    }

    public static class Taxi implements Wheels {

    }

}
