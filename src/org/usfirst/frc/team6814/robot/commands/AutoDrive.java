package org.usfirst.frc.team6814.robot.commands;

import org.usfirst.frc.team6814.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command{
	private boolean currentState = false;
	
	@Override
	protected void execute() {
		RobotMap.driveBot.tankDrive(.3, .3);
		if(RobotMap.timer.get() > 3) {
			currentState = true;
		}
	}
	
	@Override
	protected boolean isFinished() {
		return currentState;
	}
	
	@Override
	protected void end() {
		RobotMap.timer.reset();
	}
	
}
