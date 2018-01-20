package org.usfirst.frc.team6814.robot.commands;

import org.usfirst.frc.team6814.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

public class GrabbyGrabbyClose extends Command{
	private Joystick rightStick;
	
	public GrabbyGrabbyClose(Joystick rightJoystick) {
		this.rightStick = rightJoystick;
	}
	
	@Override
	protected void execute() {
		if(this.rightStick.getRawButton(1)) {
			RobotMap.solenoid.set(DoubleSolenoid.Value.kForward);
		}else {
			RobotMap.solenoid.set(DoubleSolenoid.Value.kReverse);
		}
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
