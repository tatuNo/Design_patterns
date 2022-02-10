import java.time.LocalDateTime;
import java.util.TimerTask;

public class Ticker extends TimerTask {
	
	private ClockTimer timer;
	
	public Ticker (ClockTimer timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {
		timer.setTime(LocalDateTime.now());
	}
}
