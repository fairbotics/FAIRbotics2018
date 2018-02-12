package org.usfirst.frc.team5340.robot.subsystems;

import org.usfirst.frc.team5340.robot.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
 	Spark lift = new Spark(RobotMap.LIFT_MOTOR);
//	Talon lift = new Talon(RobotMap.LIFT_MOTOR);
	DigitalInput limit1 = new DigitalInput(5);
	DigitalInput limit2 = new DigitalInput(6);
	Counter counter = new Counter(limit1);
	Counter counter2 = new Counter(limit2);
	
	
	
	public boolean isSwitchSet(){
		return counter.get() > 0;
	}
	
	public void startCounter(){
		counter.reset();
	}
	
	public boolean isSwitchSet2(){
		return counter2.get() > 0;
	}
	
	public void startCounter2(){
		counter2.reset();
	}
	
	public void LiftUp() {
		lift.set(-1);
	}
	
	public void LiftStop() {
		lift.set(0);
	}
	


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

