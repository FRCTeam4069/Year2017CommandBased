package frc.team4069.robot.commands;

// A command to start running the shooter and the feeder
public class ShooterStartCommand extends CommandBase {

    // Start running the shooter and feeder when initialized
    @Override
    protected void initialize() {
        shooter.start();
        feeder.start();
    }

    // This command does not need to run for any length of time
    @Override
    protected boolean isFinished() {
        return true;
    }
}