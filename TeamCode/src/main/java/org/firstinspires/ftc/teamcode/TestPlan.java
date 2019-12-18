package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.Robot;

class TestPlan{
    private Chassis c;
    public TestPlan(Robot c){
        this.c = new Chassis();
    }
    public void run(){
        c.StraitMotion(1.0,5);
        c.StraitMotion(1.0,5);
    }
}