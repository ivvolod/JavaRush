package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable {
//    public abstract BodyPart attack();
//    public abstract BodyPart defense();
    private static int hitCount;
    private String name;
    public String getName() {
        return name;
    }
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        Random random = new Random();
        hitCount = random.nextInt(3);

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
//            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }else if (hitCount == 0) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense(){
        BodyPart defendedBodyPart = null;
        Random random = new Random();
        hitCount = random.nextInt(3);
//        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
//            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }else if (hitCount == 0) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }


}
