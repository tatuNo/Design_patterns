
public class ComputerFacade {
	
	private Cpu cpu;
	private HardDrive hd;
	private Memory memory;
	
	public ComputerFacade() {
		cpu = new Cpu();
		hd = new HardDrive();
		memory = new Memory();
	}
	
	public void start() {
		cpu.freeze();
		memory.load(3, hd.read(6, 9));
		cpu.jump(12);
		cpu.execute();
	}
}
