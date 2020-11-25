package co.g2academy.basic;

public class MyDate {
		private int day = 1;
		private int month = 1;
 		private int year = 2000;

		 // Konstruktor
 		public MyDate(int day, int month, int year) {
 			this.day = day;
 			this.month = month;
 			this.year = year;
 		}
 		public MyDate(MyDate date) {
 			this.day = date.day;
 			this.month = date.month;
 			this.year = date.year;
 		}

         public void setDay(int day) {
             this.day = day;
         }

		public MyDate addDays(int moreDays) {
 			MyDate newDate = new MyDate(this);
 			newDate.day = newDate.day + moreDays;
 			// Not Yet Implemented: wrap around code...
 			return newDate;
        }

    	public void addMonths(int inputMonths) {
 			this.month = month + inputMonths;
        }

		public void remDays(int remDays) {
			this.day = day - remDays;
		}

		public void remMonths(int remMonths) {
			this.month = month - remMonths;
		}

        public void addYears(int inputYear) {
            this.year = year + inputYear;
        }

         public String toString() {
               String retString = "" + day + "-" + month + "-" + year;
 		        return retString;
 		}
}
