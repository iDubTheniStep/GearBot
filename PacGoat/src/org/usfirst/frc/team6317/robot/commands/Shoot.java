package org.usfirst.frc.team6317.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6317.robot.subsystems.Collector;

/**
 * Shoot the ball at the current angle.
 */
public class Shoot extends CommandGroup {
	public Shoot() {
		addSequential(new WaitForPressure());
		addSequential(new SetCollectionSpeed(Collector.kStop));
		addSequential(new OpenClaw());
		addSequential(new ExtendShooter());
	}
}
