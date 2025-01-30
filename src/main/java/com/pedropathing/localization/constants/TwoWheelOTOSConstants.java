package com.pedropathing.localization.constants;

import com.pedropathing.localization.Encoder;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.hardware.sparkfun.SparkFunOTOS;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/**
 * This is the TwoWheelOTOSConstants class. It holds many constants and parameters for the Two Wheel + OTOS IMU Localizer.
 * @author scama - 16166 WATT's UP
 * @version 0.1
 */

public class TwoWheelOTOSConstants {
    /** The name of the OTOS sensor in the hardware map
     * Default Value: "sensor_otos" */
    public static String OTOS_HardwareMapName = "sensor_otos";

    /** The offset of the OTOS sensor from the center of the robot
     * For the OTOS, left/right is the y axis and forward/backward is the x axis, with left being positive y and forward being positive x.
     * PI/2 radians is facing forward, and clockwise rotation is negative rotation.
     * Default Value: new Pose2D(0, 0, Math.PI / 2) */
    public static SparkFunOTOS.Pose2D offset = new SparkFunOTOS.Pose2D(0, 0, Math.PI / 2);

    /** The angular scalar of the OTOS sensor
     * Default Value: 1.0 */
    public static double angularScalar = 1.0;

    /** The number of inches per tick of the encoder for forward movement
     * Default Value: .001989436789 */
    public static double forwardTicksToInches = .001989436789;

    /** The number of inches per tick of the encoder for lateral movement (strafing)
     * Default Value: .001989436789 */
    public static double strafeTicksToInches = .001989436789;

    /** The y offset of the forward encoder (Deadwheel) from the center of the robot
     * Default Value: 1 */
    public static double forwardY = 1;

    /** The x offset of the strafe encoder (Deadwheel) from the center of the robot
     * Default Value: -2.5 */
    public static double strafeX = -2.5;

    /** The Hardware Map Name of the Forward Encoder (name of the motor port it is plugged into)
     * Default Value: "leftFront" */
    public static String forwardEncoder_HardwareMapName = "leftFront";

    /** The Hardware Map Name of the Strafe Encoder (name of the motor port it is plugged into)
     * Default Value: "rightRear" */
    public static String strafeEncoder_HardwareMapName = "rightRear";

    /** The direction of the forward encoder
     * Default Value: Encoder.REVERSE */
    public static double forwardEncoderDirection = Encoder.REVERSE;

    /** The direction of the strafe encoder
     * Default Value: Encoder.FORWARD */
    public static double strafeEncoderDirection = Encoder.FORWARD;
}
