package org.firstinspires.ftc.teamcode.sensors;


import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.FTCUtilities;

public class LimitSwitch {
    TouchSensor limitSwitch;

    public LimitSwitch(String deviceName) {
        limitSwitch = FTCUtilities.getTouchSensor(deviceName);
    }

    public boolean isTriggered() {
        return limitSwitch.isPressed();
    }
}
