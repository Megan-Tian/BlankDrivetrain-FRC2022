// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.frcteam2910.common.robot.UpdateManager;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.OI; 

import org.frcteam2910.common.math.Rotation2;
import org.frcteam2910.common.robot.input.Controller;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  // drivetrain definitions
  private final DrivetrainSubsystem drivetrain = new DrivetrainSubsystem();
  private final UpdateManager updateManager = new UpdateManager(drivetrain); // have no idea what this is
  // 2910 doesn't import their DriveCommand in the swervebot example 
  // TODO - i think DriveCommand drives to a specified coordinate?
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    /* from 2910 robot container
    CommandScheduler.getInstance().setDefaultCommand(drivetrain, new DriveCommand(
                drivetrain,
                () -> controller.getLeftYAxis().get(true),
                () -> controller.getLeftXAxis().get(true),
                () -> controller.getRightXAxis().get(true)
        ));
    */

    CommandScheduler.getInstance().setDefaultCommand(drivetrain, new DriveCommand(
      drivetrain, 
      () -> OI.leftStick.getY(), 
      () -> OI.leftStick.getX(), 
      () -> OI.rightStick.getRawAxis(RobotMap.RIGHT_JOYSTICK_CHANNEL)
    )); // idk why these lambdas are here but they work ? maybe ?

    updateManager.startLoop(5.0e-3);
    
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
