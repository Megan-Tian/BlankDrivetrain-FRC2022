# BlankDrivetrain-FRC2022

## What I did
- Started with a blank CommandRobot template
- Copied 2910's DrivetrainSubsystem and DriveCommand into main robot code 
- Updated RobotMap and RobotContainer with 2910 stuff
- Added OI.java for joysticks

## Things to note
- 2910 uses Xbox controllers, we use joysticks
  - Need to test that the "conversion" between control systems works, particularly reading the axis
  - Why does the code in RobotContainer `CommandScheduler.getInstance().setDefaultCommand(drivetrain, new DriveCommand(...));` use lambdas to get joystick values?

## TODOs
- Add a drive straight auto command
