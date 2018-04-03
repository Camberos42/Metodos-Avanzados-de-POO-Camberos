
public class CeilingFanBajo implements Command{
	
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanBajo(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.Bajo();
	}

	public void undo() {
		if (prevSpeed == CeilingFan.Alto) {
			ceilingFan.Alto();
			} else if (prevSpeed == CeilingFan.Medio) {
			ceilingFan.Medio();
			} else if (prevSpeed == CeilingFan.Bajo) {
			ceilingFan.Bajo();
			} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
			}
		
	}


}
