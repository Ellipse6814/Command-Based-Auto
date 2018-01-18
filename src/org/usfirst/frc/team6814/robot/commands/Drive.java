package org.usfirst.frc.team6814.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team6814.robot.RobotMap;

public class Drive extends Command {
	public DifferentialDrive bot;
	public Joystick controller;
	
	public Drive(Joystick controller) {
		this.controller = controller;
		bot = new DifferentialDrive(RobotMap.leftMotor, RobotMap.rightMotor);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void execute() {
		bot.tankDrive(controller.getRawAxis(2) * -1, controller.getRawAxis(5) * -1);
	}
	
	@Override
	protected void end() {
		
	}
	
}