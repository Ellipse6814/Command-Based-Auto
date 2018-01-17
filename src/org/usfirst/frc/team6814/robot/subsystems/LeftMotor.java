package org.usfirst.frc.team6814.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;

public class LeftMotor extends Subsystem {
	
	protected Spark motor = new Spark(0);
	
	public void initDefaultCommand() {
		
	}
	
	public void run(double speed) {
		motor.set(speed);
	}
}
