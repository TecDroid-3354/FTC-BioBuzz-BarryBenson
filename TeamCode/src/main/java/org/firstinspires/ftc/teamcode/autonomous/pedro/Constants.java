package org.firstinspires.ftc.teamcode.autonomous.pedro;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.algorithm.ForesightConfig;
import com.pedropathing.follower.Follower;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.pedropathing.revhub.localizers.PinpointConfig;
import com.pedropathing.revhub.localizers.PinpointLocalizer;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.mecanum.MecanumConstants;
import org.firstinspires.ftc.teamcode.utils.autonomous.PedroPathing;

import java.util.Optional;

public class Constants {

    public static MecanumConfig driveConfig = PedroPathing.INSTANCE.createMecanumConfig(
            Optional.of(DcMotorSimple.Direction.FORWARD),
            Optional.of(DcMotorSimple.Direction.FORWARD),
            Optional.of(DcMotorSimple.Direction.REVERSE),
            Optional.of(DcMotorSimple.Direction.REVERSE),
            Optional.of(MecanumConstants.Control.IS_BRAKE_MODE)
    );

    public static PinpointConfig pinpointLocalizerConfig = PedroPathing.INSTANCE.createPinpointConfig(
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );

    // TODO Finish adding all the configurations
    public static ForesightConfig foresightConfig = PedroPathing.INSTANCE.createForesightConfig(
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );

    public static Follower create(HardwareMap h) {
        return new Follower(
                new PinpointLocalizer(h, pinpointLocalizerConfig),
                new Mecanum(h, driveConfig),
                new Foresight(foresightConfig)
        );
    }
}