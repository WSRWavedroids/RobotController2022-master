package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A2 Start (Red Terminal)")
public class RedA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Red A2";

        //org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers MayFlowers = new MayFlowers();
        MayFlowers.initCamera(hardwareMap, telemetry, this);

        while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();
        }

        //Do this to pass inspection.
        //waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;
        moveArm("Up", 0.75);
        moveRobotForward(1500, 50);
        moveRobotBackward(300, 50);
        moveRobotRight(1875, 50);
        sleepTime = (1800);
        moveArm("Up",0.75);
        prepareNextAction(100);
        speed = 0.25;
        moveRobotForward(275, 50);
        moveArm("Down",0.75);
        sleep(50);
        robot.slide.setPower(0.1);
        robot.openAndCloseClaw(0.3);
        prepareNextAction(25);
        moveRobotBackward(150, 50);
        prepareNextAction(100);
        speed = 0.5;

        if (robot.parkingZone == 1){

            moveRobotLeft(3200, 50);

        } else if (robot.parkingZone == 2){

            moveRobotLeft(1900, 50);

        } else if (robot.parkingZone == 3){

            moveRobotLeft(600, 50);

        } else {

            moveRobotLeft(600, 50);

        }

        //moveRobotForward(740, 50);

    }
}


