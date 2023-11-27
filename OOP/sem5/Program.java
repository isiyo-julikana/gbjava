package OOP.sem5;

import OOP.sem5.models.TableModel;
import OOP.sem5.presenters.BookingPresenter;
import OOP.sem5.views.BookingView;

import java.util.Date;

public class Program {

    //TODO: Метод changeReservationTable должен заработать!
    public static void main(String[] args) {

        int tableNum = 2, newTableNum = 3;

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(), tableNum, "Максим");
        bookingPresenter.updateTablesUI();

        view.changeReservationTable(101, tableNum, new Date(), newTableNum, "Максим");
        bookingPresenter.updateTablesUI();
    }

}
