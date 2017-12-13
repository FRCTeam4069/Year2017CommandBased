package frc.team4069.robot.commands;

// A command to toggle the elevator
public class ElevatorToggleCommand extends CommandBase {

    // Toggle the elevator on initialization
    @Override
    protected void initialize() {
        // Claim the elevator subsystem
        requires(elevator);
        // It should start out idle
        elevator.stop();

        // Check if it is started, and if it is, stop it
        if (elevator.isStarted()) {
            elevator.stop();
        }
        // If it is stopped, start it
        else {
            elevator.start();
        }
    }

    // This command does not need to run for any length of time
    @Override
    protected boolean isFinished() {
        return true;
    }
}
