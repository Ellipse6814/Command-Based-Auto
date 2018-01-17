package org.usfirst.frc.team6814.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RightMotor extends Subsystem{
	protected Spark motor = new Spark(1);
	
	public void initDefaultCommand() {
		
	}
	
	public void run(double speed) {
		motor.set(speed);
	}
}
