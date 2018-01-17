package org.usfirst.frc.team6814.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

public class Drive extends Command {
	public double leftSpeed = 0;
	public double rightSpeed = 0;
	public Spark leftMotor;
	public Spark rightMotor;
	public DifferentialDrive bot;
	public Joystick controller;
	
	public Drive(Joystick controller) {
		this.controller = controller;
		this.leftMotor = new Spark(0);
		this.rightMotor = new Spark(1);
		bot = new DifferentialDrive(leftMotor, rightMotor);
	}
	
	public void setSpeed(double leftValue, double rightValue) {
		this.leftSpeed = leftValue;
		this.rightSpeed = rightValue;
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
