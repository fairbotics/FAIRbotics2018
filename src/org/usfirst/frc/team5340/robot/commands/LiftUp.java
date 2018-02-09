package org.usfirst.frc.team5340.robot.commands;

import org.usfirst.frc.team5340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftUp extends Command {
	
	

    public LiftUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.liftSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	Robot.safeSub.startCounter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.liftSub.LiftUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
//        return Robot.eleSub.isSwitchSet();
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.liftSub.LiftStop();
//    	Robot.eleSub.ElevatorStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
