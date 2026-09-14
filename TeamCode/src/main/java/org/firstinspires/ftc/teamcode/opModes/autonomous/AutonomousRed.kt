package org.firstinspires.ftc.teamcode.opModes.autonomous

import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.autonomous.builder.AutonomousBuilder
import org.firstinspires.ftc.teamcode.utils.Alliance

@TeleOp(group = "Autonomous", name = "Auto - Red")
class AutonomousRed: AutonomousBuilder(Alliance.RED)