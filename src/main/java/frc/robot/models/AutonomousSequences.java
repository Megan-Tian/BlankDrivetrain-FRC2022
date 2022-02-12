// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.models;

// import org.frcteam2910.common.control.Path;
// import org.frcteam2910.common.control.SimplePathBuilder;
// import org.frcteam2910.common.control.Trajectory;
// import org.frcteam2910.common.math.Rotation2;
// import org.frcteam2910.common.math.Vector2;

// import frc.robot.commands.AutonomousTrajectoryCommand;

// import edu.wpi.first.wpilibj.command.CommandGroup;
// import frc.robot.Robot;
// import frc.robot.RobotContainer;

// /** Add your docs here. */
// public class AutonomousSequences {
//     public static CommandGroup DriveStraight() {
//         CommandGroup output = new CommandGroup();
//         SimplePathBuilder pathBuilder = new SimplePathBuilder(new Vector2(0.0,0.0), Rotation2.ZERO);
//         pathBuilder.lineTo(new Vector2(-96.0, 0.0));
            
//         SimplePathBuilder goBackwards = new SimplePathBuilder(new Vector2(0.0,0.0), Rotation2.ZERO);
//         goBackwards.lineTo(new Vector2(96.0,0.0));
//         Path path = pathBuilder.build();
//         Path path2 = goBackwards.build();
         
//         Trajectory driveTrajectory = new Trajectory(path, RobotContainer.m_drivetrainSubsystem.AUTONOMOUS_CONSTRAINTS, sampleDistance, startingVelocity, endingVelocity);
//         AutonomousTrajectoryCommand driveCommand1 = new AutonomousTrajectoryCommand(driveTrajectory);
//         Trajectory driveTrajectory2 = new Trajectory(path2, RobotContainer.m_drivetrainSubsystem.AUTONOMOUS_CONSTRAINTS, sampleDistance, startingVelocity, endingVelocity);
//         AutonomousTrajectoryCommand driveCommand2 = new AutonomousTrajectoryCommand(driveTrajectory2);
//         // System.out.println("command almost finished");
//         output.addSequential(driveCommand1);
//         output.addSequential(driveCommand2);

//         return output;
//     }
// }
