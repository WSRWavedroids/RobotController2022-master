package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Blue", name = "Blue A3 Start (Red Terminal)")
public class BlueA3Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;//return to 400
        moveArm("Up", .75);

        prepareNextAction(100);
        moveRobotForward(1500);
        prepareNextAction(120);
        moveRobotBackward(300);
        prepareNextAction(175);
        moveRobotLeft(1800);//strafe is not perfection
        prepareNextAction(100);
        sleepTime = 1680;
        moveArm("Up", .75);
        prepareNextAction(100);
        moveRobotForward(275);
        prepareNextAction(450);
        robot.openAndCloseClaw(.3);
        prepareNextAction(200);
        robot.openAndCloseClaw(0);
        prepareNextAction(100);
        moveRobotBackward(150);
        prepareNextAction(100);
        moveArm("Down",0.25);
        prepareNextAction(100);
        moveRobotRight(600);
        prepareNextAction(100);
        moveRobotForward(740);
        prepareNextAction(100);

    }
}

//this works for blue a2 and red a5
