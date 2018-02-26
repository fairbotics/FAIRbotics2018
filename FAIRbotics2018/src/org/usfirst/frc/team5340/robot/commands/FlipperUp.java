package org.usfirst.frc.team5340.robot.commands;

import org.usfirst.frc.team5340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipperUp extends Command {
	
	

    public FlipperUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.flipSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.flipSub.startCounter();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	Robot.flipSub.FlipperUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.flipSub.isSwitchSet();
    }

    // Called once after isFinished returns true
    protected void end() {
//    	Robot.eleSub.ElevatorStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}