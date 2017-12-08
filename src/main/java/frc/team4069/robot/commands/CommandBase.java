package frc.team4069.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4069.robot.subsystems.DriveBaseSubsystem;
import frc.team4069.robot.subsystems.ElevatorSubsystem;
import frc.team4069.robot.subsystems.FeederSubsystem;
import frc.team4069.robot.subsystems.ShooterSubsystem;

// A generic command class that contains references to all of the subsystems and initializes them
public abstract class CommandBase extends Command {

    // Instances of each of the subsystems
    static DriveBaseSubsystem driveBase;
    static ElevatorSubsystem elevator;
    static FeederSubsystem feeder;
    static ShooterSubsystem shooter;

    // An function that handles initialization of subsystems
    public static void init() {
        // Get the singleton instance of each of the subsystems
        driveBase = DriveBaseSubsystem.getInstance();
        elevator = ElevatorSubsystem.getInstance();
        feeder = FeederSubsystem.getInstance();
        shooter = ShooterSubsystem.getInstance();
    }

    // A function called periodically to update all subsystems
    public static void update() {
        // Update each of the subsystems that need updating
        driveBase.update();
    }
}
