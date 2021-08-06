package wgu.stone.DAO.interfaces;

import javafx.collections.ObservableList;
import wgu.stone.model.Appointment;
import wgu.stone.model.Contact;

public interface AppointmentDAO {
    ObservableList<Appointment> getAppointmentsList();
    void deleteAppointment(int id);
    void updateAppointment(Appointment appointment);
    void saveAppointment(Appointment appointment);
    ObservableList<Contact> getContactsList();
    ObservableList<Appointment> getContactScheduleList();
}
