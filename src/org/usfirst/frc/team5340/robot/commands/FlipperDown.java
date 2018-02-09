package org.usfirst.frc.team5340.robot.commands;

import org.usfirst.frc.team5340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipperDown extends Command {

    public FlipperDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.flipSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.flipSub.startCounter2();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.flipSub.FlipperDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.flipSub.isSwitchSet2();
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
