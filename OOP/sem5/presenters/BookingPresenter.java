package OOP.sem5.presenters;

import java.util.Collection;
import java.util.Date;

import OOP.sem5.models.Table;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public Collection<Table> loadTables() {
        return model.loadTables();
    }

    public void updateTablesUI() {
        view.showTables(model.loadTables());
    }

    public void updateReservationResultUI(String name, int tableNum, Date orderDate, int reservationId) {
        view.printReservationTableResult(name, tableNum, orderDate, reservationId);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        System.out.println("Презентер реагирует на событие");
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            view.showReservationTableResult(reservationNo);
        } catch (RuntimeException e) {
            view.showReservationTableResult(-1);
        }

    }

    @Override
    public void chReservationTable(int oldReserv, int oldTable, Date orderDate, int tableNo, String name) {
        int chReservationNo = model.changeReservationTable(oldReserv, oldTable, orderDate, tableNo, name);
        updateReservationResultUI(name, tableNo, orderDate, chReservationNo);
    }
}