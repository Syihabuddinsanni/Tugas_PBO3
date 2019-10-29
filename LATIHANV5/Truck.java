package LATIHANV5;

    public class Truck {
        //the truck class has three fields
        public int cadence;
        public int gear;
        public int speed;
        //the truck class has one constructor
        //INDONYA = Intinya ini konstruktor
        public Truck (int startCadence, int startSpeed, int startGear)
        {
            gear = startGear;
            cadence = startCadence;
            speed = startSpeed;
        }
        //the truck has four method
        //INDO = Intinya ini method nya  :v
        public void setCadence (int newValue)
        {
            cadence = newValue;
        }
        public void setGear(int newValue)
        {
            gear = newValue;
        }
        public void applybrake (int decrement)
        {
            speed = decrement;
        }
        public void speedUp(int increment)
        {
            speed = increment;
        }
            
    
}
