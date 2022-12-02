package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Blue", name = "Blue A3 Start (Red Terminal)")
public class BlueA3Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(100);
        moveRobotForward(1100);
        prepareNextAction(100);
        moveRobotLeft(1550);
        prepareNextAction(100);
        moveArm("up",0.75);
        prepareNextAction(100);
        robot.openAndCloseClaw(1);
        prepareNextAction(100);
        moveArm("down",0.75);
        prepareNextAction(100);
        moveRobotBackward(50);
        prepareNextAction(100);
        moveRobotRight(250);
        prepareNextAction(100);
        moveRobotForward(300);


    }
}

//blue a2 and red a5 zone 2 on medium pole and zone 3 small pole idk arm values
//red a2 blue a5 opposite
