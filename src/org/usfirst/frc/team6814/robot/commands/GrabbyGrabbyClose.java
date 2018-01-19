package org.usfirst.frc.team6814.robot.commands;

import org.usfirst.frc.team6814.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class GrabbyGrabbyClose extends Command{
	
	@Override
	protected void execute() {
		RobotMap.solenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		RobotMap.solenoid.set(DoubleSolenoid.Value.kOff);
	}
}
