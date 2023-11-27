package OOP.sem5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;

    private final int no;

    private boolean status;

    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    public Table(){
        no = ++counter;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
