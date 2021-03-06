package org.usfirst.frc.team5340.robot.subsystems;

import org.usfirst.frc.team5340.robot.OI;
import org.usfirst.frc.team5340.robot.Robot;
import org.usfirst.frc.team5340.robot.RobotMap;

import org.usfirst.frc.team5340.robot.commands.Elevate;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;


/**
 *
 */
public class Elevater extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static boolean fast = false;
	
	static DigitalInput topLimitSwitch = new DigitalInput(RobotMap.ELEVATER_TOP_LIMIT);
	static DigitalInput bottomLimitSwitch = new DigitalInput(RobotMap.ELEVATER_BOTTOM_LIMIT);

	
	static Spark elevate1 = new Spark(RobotMap.ELEVATE_MOTOR1);
	
	public static void ElevateUp(double speed){
		
		if(!topLimitSwitch.get()){
			elevate1.set(speed);
		}
		
	}
	public static void ElevateDown(double speed){
		
		if(!bottomLimitSwitch.get()){
			elevate1.set(-speed);
		}
		
	}
	public static void ElevateStop(){
		
		elevate1.set(0);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Elevate());
    }
}

