
package org.usfirst.frc.team5340.robot;
//import org.usfirst.frc.team5340.robot.commands.AutoGroup;
import org.usfirst.frc.team5340.robot.commands.AutoGroup;
import org.usfirst.frc.team5340.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5340.robot.subsystems.Flipper;
import org.usfirst.frc.team5340.robot.subsystems.Gripper;
import org.usfirst.frc.team5340.robot.subsystems.Elevater;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public static OI oi;
	public static DriveTrain driveSub = new DriveTrain();
	public static Flipper flipSub = new Flipper();
	public static Gripper gripSub = new Gripper();
	public static Elevater elevateSub = new Elevater();
    Command autonomousCommand = new AutoGroup();
	boolean autoEnable = true;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		
	UsbCamera camera1 = CameraServer.getInstance().startAutomaticCapture(0);
	camera1.setResolution(320,200);
	camera1.setFPS(15);
	UsbCamera camera2 = CameraServer.getInstance().startAutomaticCapture(1);
	camera2.setResolution(320,200);
	camera2.setFPS(15);
	//Can remove camera code below by choice
		//Camera number (cam#) may change. Check in web dashboard 
		//server.startAutomaticCapture("cam2");
		//Camera number (cam#) may change. Check in web dashboard 
		//server.startAutomaticCapture("cam5");
        // instantiate the command used for the autonomous period
		//oi.driveStick1.whileHeld(new ElevatorUp());
    }
    
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    	if(!autoEnable) return;
    		autonomousCommand.start();
    		
        
    	}
    

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
       Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
 //       if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
