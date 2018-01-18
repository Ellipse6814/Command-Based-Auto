package org.usfirst.frc.team6814.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team6814.robot.RobotMap;

public class Drive extends Command {
	public Joystick controller;
	
	public Drive(Joystick controller) {
		this.controller = controller;
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void execute() {
		RobotMap.driveBot.tankDrive(controller.getRawAxis(2) * -1, controller.getRawAxis(5) * -1);
	}
	
	@Override
	protected void end() {
		
	}
	
}