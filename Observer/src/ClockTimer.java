import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClockTimer {
	
	private LocalDateTime time;
	private PropertyChangeSupport support;
	
	public ClockTimer () {
		support = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
	public void setTime(LocalDateTime time) {
		support.firePropertyChange("time", this.time, time);
		this.time = time;
	}
	
	public LocalDateTime getTime() {
		return time;
	}

}
