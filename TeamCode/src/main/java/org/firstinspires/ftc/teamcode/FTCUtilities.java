package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.FTCUtilities;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class FTCUtilities {

    private static HardwareMap hardwareMap;
    private static Telemetry telemetry;
    private static OpMode opMode;

    public static HardwareMap getHardwareMap(){
        return hardwareMap;
    }

    public static void setHardWareMap(HardwareMap hw){
        FTCUtilities.hardwareMap = hw;
    }

    public static void setTelemetry(Telemetry t){
        FTCUtilities.telemetry = t;
    }

    public static Telemetry getTelemetry(){
        return telemetry;
    }
    public static BNO055IMU getIMU (String imuName){
        return hardwareMap.get(BNO055IMU.class, imuName);
    }
    public static TouchSensor getTouchSensor (String sensorName){
        return hardwareMap.get(TouchSensor.class, sensorName);
    }


    public static void setOpMode(OpMode o){
        FTCUtilities.opMode = o;
    }

    public static void OpSleep(int ms){
        ((LinearOpMode) opMode).sleep(ms);
    }
}
