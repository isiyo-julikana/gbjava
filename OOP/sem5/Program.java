package OOP.sem5.lesson5;

import OOP.sem5.models.TableModel;
import OOP.sem5.presenters.BookingPresenter;
import OOP.sem5.views.BookingView;

import java.util.Date;

public class Program {

    //TODO: Метод changeReservationTable должен заработать!
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();
        bookingView.reservationTable(new Date(), 3, "Станислав");


        bookingView.changeReservationTable(1004, new Date(), 2, "Станислав");

    }

}
