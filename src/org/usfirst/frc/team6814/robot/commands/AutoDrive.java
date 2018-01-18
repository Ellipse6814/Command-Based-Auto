package org.usfirst.frc.team6814.robot.commands;

import org.usfirst.frc.team6814.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command{
	
	@Override
	protected void execute() {
		RobotMap.driveBot.tankDrive(.3, .3);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
}
