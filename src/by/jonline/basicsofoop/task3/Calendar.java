package by.jonline.basicsofoop.task3;

import java.util.LinkedList;
import java.util.List;

public class Calendar {
	private List<Day> dayList;

	public Calendar() {
		dayList = new LinkedList<>();
	}

	public abstract class Day {
		private int date;

		protected Day() {
		}

		protected Day(int date) {
			this.date = date;
		}

		public int getDate() {
			return date;
		}

		@Override
		public String toString() {
			return "Day [date = " + date + "]";
		}

	}

	public class Holiday extends Day {
		private String name;

		public Holiday() {
		}

		public Holiday(int date, String name) {
			super(date);
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Holiday [date = " + super.getDate() + ", name = " + name + "]";
		}

	}

	public class DayOff extends Day {
		private String dayOffplan;

		public DayOff() {

		}

		public DayOff(int date, String dayOffPlan) {
			super(date);
			this.dayOffplan = dayOffPlan;
		}

		public String getDayOffplan() {
			return dayOffplan;
		}

		public void setDayOffplan(String dayOffplan) {
			this.dayOffplan = dayOffplan;
		}

		@Override
		public String toString() {
			return "DayOff [date = " + super.getDate() + ", dayOffplan = " + dayOffplan + "]";
		}

	}

	public class WorkDay extends Day {
		private String workPlane;

		public WorkDay() {
		}

		public WorkDay(int date, String workPlan) {
			super(date);
			this.workPlane = workPlan;
		}

		public String getWorkPlane() {
			return workPlane;
		}

		public void setWorkPlane(String workPlane) {
			this.workPlane = workPlane;
		}

		@Override
		public String toString() {
			return "WorkDay [date = " + super.getDate() + ", workPlane = " + workPlane + "]";
		}

	}

	public class CalendarLogic {
		public void addHoliday(int date, String name) {
			dayList.add(new Holiday(date, name));
		}

		public void addDayOff(int date, String dayOffPlan) {
			dayList.add(new DayOff(date, dayOffPlan));
		}

		public void addWorkDay(int date, String workDayPlan) {
			dayList.add(new WorkDay(date, workDayPlan));
		}
	}

	public List<Day> getDayList() {
		return dayList;
	}

	@Override
	public String toString() {
		return "Calendar [dayList = " + dayList + "]";
	}

}
