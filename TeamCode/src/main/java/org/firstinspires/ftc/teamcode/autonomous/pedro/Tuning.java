package org.firstinspires.ftc.teamcode.autonomous.pedro;

import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.tuning.autotune.Tuner;
import org.firstinspires.ftc.teamcode.autonomous.pedro.procedures.MecanumTuner;
import org.firstinspires.ftc.teamcode.autonomous.pedro.procedures.PinpointTuner;
import org.firstinspires.ftc.teamcode.utils.autonomous.PedroPathing;

public class Tuning {

    // Mecanum Tuner, obtain motor directions
    @Tuner
    public static Procedure mecanumTuner() {
        return new MecanumTuner();
    }

    // GoBilda Pinpoint Odometry computer tuning
    @Tuner
    public static Procedure pinpointTuner() {
        return new PinpointTuner();
    }

    @Tuner
    public static Procedure foresightTuner() {
        return PedroPathing.INSTANCE.createForesightTunerWithPinpoint(Constants.driveConfig, Constants.pinpointLocalizerConfig);
    }

    // TODO Once you've tuned your localizer create another test which receives either and OTOS or PinpointConfig
    @Tuner
    public static Procedure tests() {
        return PedroPathing.INSTANCE.createMecanumOnlyTest(Constants.driveConfig);
    }
}
