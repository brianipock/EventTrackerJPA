package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class vr {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String title;
		@Column(name = "time_played")
		private int timePlayed;
		private String review;
		private boolean crash;

		public vr(){}

		public vr(int id, String title, int timePlayed, String review, boolean crash) {
			super();
			this.id = id;
			this.title = title;
			this.timePlayed = timePlayed;
			this.review = review;
			this.crash = crash;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getTimePlayed() {
			return timePlayed;
		}

		public void setTimePlayed(int timePlayed) {
			this.timePlayed = timePlayed;
		}

		public String getReview() {
			return review;
		}

		public void setReview(String review) {
			this.review = review;
		}

		public boolean isCrash() {
			return crash;
		}

		public void setCrash(boolean crash) {
			this.crash = crash;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "vr [id=" + id + ", title=" + title + ", timePlayed=" + timePlayed + ", review=" + review
					+ ", crash=" + crash + "]";
		}
		


}


