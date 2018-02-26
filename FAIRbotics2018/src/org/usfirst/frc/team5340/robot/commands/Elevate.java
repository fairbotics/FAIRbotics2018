package org.usfirst.frc.team5340.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5340.robot.Robot;
import org.usfirst.frc.team5340.robot.subsystems.Elevater;

/**
 *
 */
public class Elevate extends Command {

	double lowSpeed = 0.7;
	double highSpeed = 1;
	
	double speed = lowSpeed;
	
    public Elevate() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.elevateSub);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(Elevater.fast == true){
    		
    		speed = highSpeed;
    		
    	}
    	if(Elevater.fast == false){
    		
    		speed = lowSpeed;
    		
    	}
    	
    	switch(Robot.oi.driveStick1.getPOV()){
    	
	    	case(0) : {
	    		
	    		Elevater.ElevateUp(speed);
	    		
	    		break;
	    		
	    	}
	    	case(180) : {
	    		
	    		Elevater.ElevateDown(speed);
	    		break;
	    		
	    	}
	    	case(270) : {
	    		
	    		Elevater.fast = !Elevater.fast;
	    		while(Robot.oi.driveStick1.getPOV() == 270){}
	    		break;
	    		
	    	}
	    	case(-1) : {
	    		
	    		Elevater.ElevateStop();
	    		
	    	}
    	
    	}
  
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
}
