package OOP.sem5.presenters;
import OOP.sem5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();


    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReserv, int oldTable, Date reservationDate, int tableNo, String name);
}
