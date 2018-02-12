package org.usfirst.frc.team5340.robot.subsystems;

import org.usfirst.frc.team5340.robot.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Flipper extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid flipSol = new Solenoid(RobotMap.FLIPPER_SOLENOID);
	DigitalInput limit1 = new DigitalInput(0);
	DigitalInput limit2 = new DigitalInput(1);
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
	
	public void FlipperUp() {
		flipSol.set(true);
	}
	
	public void FlipperDown() {
		flipSol.set(false);
	}
	


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

