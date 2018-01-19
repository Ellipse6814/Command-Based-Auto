package org.usfirst.frc.team6814.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team6814.robot.RobotMap;

public class Drive extends Command {
	public Joystick leftController;
	public Joystick rightController;
	
	public Drive(Joystick leftController, Joystick rightController) {
		this.leftController = leftController;
		this.rightController = rightController;
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void execute() {
		RobotMap.driveBot.tankDrive(leftController.getY() * -1, rightController.getY() * -1);
	}
	
	@Override
	protected void end() {
		
	}
	
}