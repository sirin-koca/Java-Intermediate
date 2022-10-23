/* Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
* Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre). Lag så en metode "visTiden" som
skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.
Skriv så kode i main for å teste ut denne klassen. */
import static javax.swing.JOptionPane.showMessageDialog;
class Clock {
    private int hour = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Clock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public void showClock(){
        showMessageDialog(null, "The time is: " + hour + ":" + minutes +":" +seconds);
    }
}

public class ShowMeTheClock{
    public static void main(String[] args) {
        Clock myClock = new Clock(23,34,12);
        myClock.showClock();
    }
}
