package frc.robot;

public class RobotMap {
    public static final int LEFT_JOYSTICK_CHANNEL = 0;
    public static final int RIGHT_JOYSTICK_CHANNEL = 1;

    // our 2021 bot channels + constant
    /*
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 8; 
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 3; 
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 7; 

    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 4; 
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 2;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 3; 
    
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 6; 
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 1;
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 5; 

    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 2;
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 0;
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 1; 

    private static final double BACK_RIGHT_ANGLE_OFFSET_COMPETITION = Math.toRadians(-29.9); //95.7
    private static final double BACK_LEFT_ANGLE_OFFSET_COMPETITION = Math.toRadians(-145.8+5); //-148 + 180   -326.8
    private static final double FRONT_RIGHT_ANGLE_OFFSET_COMPETITION = Math.toRadians(48.5 + 45); //14
    private static final double FRONT_LEFT_ANGLE_OFFSET_COMPETITION = Math.toRadians(-24.5); //-336+180    -151.6
    */


    public static final int DRIVETRAIN_FRONT_LEFT_MODULE_ANGLE_ENCODER = 3;
    public static final int DRIVETRAIN_FRONT_LEFT_MODULE_ANGLE_MOTOR = 8;
    public static final double DRIVETRAIN_FRONT_LEFT_MODULE_ANGLE_OFFSET = -Math.toRadians(-24.5); // 2910 used 154.3
    public static final int DRIVETRAIN_FRONT_LEFT_MODULE_DRIVE_MOTOR = 7;

    public static final int DRIVETRAIN_FRONT_RIGHT_MODULE_ANGLE_ENCODER = 2;
    public static final int DRIVETRAIN_FRONT_RIGHT_MODULE_ANGLE_MOTOR = 4;
    public static final double DRIVETRAIN_FRONT_RIGHT_MODULE_ANGLE_OFFSET = -Math.toRadians(48.5 + 45); // 2910 used 329.0
    public static final int DRIVETRAIN_FRONT_RIGHT_MODULE_DRIVE_MOTOR = 3;

    public static final int DRIVETRAIN_BACK_LEFT_MODULE_ANGLE_ENCODER = 1;
    public static final int DRIVETRAIN_BACK_LEFT_MODULE_ANGLE_MOTOR = 6;
    public static final double DRIVETRAIN_BACK_LEFT_MODULE_ANGLE_OFFSET = -Math.toRadians(-145.8+5); // 2910 used 218.1
    public static final int DRIVETRAIN_BACK_LEFT_MODULE_DRIVE_MOTOR = 5;

    public static final int DRIVETRAIN_BACK_RIGHT_MODULE_ANGLE_ENCODER = 0;
    public static final int DRIVETRAIN_BACK_RIGHT_MODULE_ANGLE_MOTOR = 2;
    public static final double DRIVETRAIN_BACK_RIGHT_MODULE_ANGLE_OFFSET = -Math.toRadians(-29.9); // 2910 used 268.9
    public static final int DRIVETRAIN_BACK_RIGHT_MODULE_DRIVE_MOTOR = 1;   

    public static final int L_REFERENCE_RESET_BUTTON = 8;
}
