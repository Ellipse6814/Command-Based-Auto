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
		 double leftStick = leftController.getY();
		 double rightStick = rightController.getY();
		 double leftPower = 0;
		 double rightPower = 0;

		 if (Math.abs(rightStick - leftStick) < 0.45) {
			 double averagePower = (leftStick + rightStick) / 2;
			 leftPower = averagePower;
			 rightPower = averagePower;
		 } else {
			 leftPower = leftStick * .8;
			 rightPower = rightStick * .8;
		 }

		 RobotMap.driveBot.tankDrive(leftPower * -1, rightPower * -1);
	}
	
	@Override
	protected void end() {
		
	}
	
}