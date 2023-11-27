package OOP.sem5.presenters;
import OOP.sem5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);

    void printReservationTableResult(String name, int tableNo, Date oredrDate, int reservationNo);

}
