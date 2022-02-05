package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.buttons.Button;
// import edu.wpi.first.wpilibj.buttons.JoystickButton;

// when importing joysticks and joystick buttons make sure it's "wpilibj2" not just "wpilibj" - the quick fix import doesn't always do this right
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class OI {
    public static Joystick rightStick = new Joystick(RobotMap.RIGHT_JOYSTICK_CHANNEL);
    public static Joystick leftStick = new Joystick(RobotMap.LEFT_JOYSTICK_CHANNEL);

    public static JoystickButton referenceResetButton = new JoystickButton(leftStick, RobotMap.L_REFERENCE_RESET_BUTTON);
}
