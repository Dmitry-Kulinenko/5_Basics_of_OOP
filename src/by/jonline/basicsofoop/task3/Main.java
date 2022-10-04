/* Создать класс Календарь с внутренним классом, с помощью объектов которого 
 * можно хранить информацию о выходных и праздничных днях.*/

package by.jonline.basicsofoop.task3;

public class Main {
	public static void main(String[] args) {
		Calendar myCalendar = new Calendar();
		Calendar.CalendarLogic logic = myCalendar.new CalendarLogic();
		logic.addWorkDay(1, "to do some work");
		logic.addDayOff(2, "meet friends");
		logic.addHoliday(3, "Birthday");
		System.out.println(myCalendar);
	}
}