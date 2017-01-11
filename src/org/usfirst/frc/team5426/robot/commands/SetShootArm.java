
package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;
import org.usfirst.frc.team5426.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Drives with the joystick
 */
public class SetShootArm extends CommandBase {
	
	public static DigitalInput shooterLimitSwitch = new DigitalInput(RobotMap.SHOOTER_LIMIT_SWITCH);
	
    public SetShootArm() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double speed = 0.1;
	    double speed = OI.logitech.getY();
	    shooter.setShaftMotorSpeed(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    public static DigitalInput getLimitSwitch() {
		return shooterLimitSwitch;
	}
}
