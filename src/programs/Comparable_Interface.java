package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Interface {
    static class Dogs implements Comparable<Dogs>{
        private String breed;
        private String temperament;
        private String origin;
        private int lifeExpectancy;
        private int weight;

        public Dogs(String breed, String temperament, String origin, int lifeExpectancy, int weight) {
            this.breed = breed;
            this.temperament = temperament;
            this.origin = origin;
            this.lifeExpectancy = lifeExpectancy;
            this.weight = weight;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getTemperament() {
            return temperament;
        }

        public void setTemperament(String temperament) {
            this.temperament = temperament;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public int getLifeExpectancy() {
            return lifeExpectancy;
        }

        public void setLifeExpectancy(int lifeExpectancy) {
            this.lifeExpectancy = lifeExpectancy;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Dogs o) {
            // We can also write: return Integer.compare(this.getLifeExpectancy(), o.getLifeExpectancy());
            if (this.getLifeExpectancy() == o.getLifeExpectancy()){
                return 0;
            } else if (this.getLifeExpectancy() > o.getLifeExpectancy()) {
                return 1;
            } else return -1;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Pomchi", "Playful and devoted", "Pomeraniana and Mexico", 15, 4);
        Dogs dog2 = new Dogs("Pomeranian", "Playful and easygoing", "Pomeraniana", 14, 3);
        Dogs dog3 = new Dogs("JRT", "Energetic and stubborn", "England", 13, 10);
        Dogs dog4 = new Dogs("German Shepherd", "Stubborn and alert","Germany", 10, 30);
        Dogs dog5 = new Dogs("Labrador", "Outgoing", "Newfoundland", 10, 26);
        Dogs dog6 = new Dogs("Samoyed", "Outgoing", "Newfoundland", 10, 20);

        ArrayList<Dogs> myDogs = new ArrayList<Dogs>();
        myDogs.add(dog1); myDogs.add(dog2); myDogs.add(dog3); myDogs.add(dog4); myDogs.add(dog5); myDogs.add(dog6);

        Collections.sort(myDogs);

        for(Dogs d : myDogs){
            System.out.println("-" + d.breed + ": " + d.temperament + ", size: " + d.weight + " kg.");
        }
    }
}
