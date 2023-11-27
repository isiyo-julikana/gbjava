package OOP.sem5.views;

import OOP.sem5.models.Table;
import OOP.sem5.presenters.View;
import OOP.sem5.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер резерва: #%d\n", reservationNo);
        } else {
            System.out.println("Произошла ошибка бронирования. Повторите операцию позже.");
        }
    }

    public void showReservationCancel(int reservationId) {
        System.out.println(String.format("Бронирование #%d успешно отменено.", reservationId));
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование
     * столика
     * 
     * @param orderDate дата бронирования
     * @param tableNo   номер столика
     * @param name      Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name) {
        System.out.println("Возбуждается событие бронирования столика");
        System.out.println("Происходит уведомление наблюдателей ...");
        for (ViewObserver observer : observers) {
            observer.onReservationTable(orderDate, tableNo, name);
        }
    }

    /**
     * TODO: метод должен заработать!
     * Действие клиента (пользователь нажал на кнопку), изменение бронирования
     * столика
     * 
     * @param orderDate дата бронирования
     * @param tableNo   номер столика
     * @param name      Имя
     */
    public void changeReservationTable(int oldReservation, int oldTableNo, Date reservationDate, int newtableNo,
            String name) {
        observer.chReservationTable(oldReservation, oldTableNo, reservationDate, newtableNo, name);
    }

    @Override
    public void printReservationTableResult(String name, int tableNo, Date date, int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("\n%s, столик #%d успешно забронирован %s. Номер вашей брони: #%d\n", name, tableNo, date,
                    reservationNo);
        else
            System.out.printf("\n%s, не удалось забронировать столик #%d. Попробуйте выполнить операцию позже.\n", name,
                    reservationNo);
    }

}
